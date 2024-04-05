package com.example.gonzalor;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DivisasFragment extends Fragment {

    private EditText entrada;
    private TextView salida;
    private Button enviar;
    private DatabaseHelper databaseHelper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_divisas, container, false);

        databaseHelper = new DatabaseHelper(getActivity());

        entrada = view.findViewById(R.id.editTextDivisas);
        salida = view.findViewById(R.id.txtResultado);
        enviar = view.findViewById(R.id.btnConsultar);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://economia.awesomeapi.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API apiService = retrofit.create(API.class);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<Map<String, Divisas>> call = apiService.getDivisas();

                call.enqueue(new Callback<Map<String, Divisas>>() {
                    @Override
                    public void onResponse(Call<Map<String, Divisas>> call, Response<Map<String, Divisas>> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            Map<String, Divisas> divisasMap = response.body();

                            SQLiteDatabase db = databaseHelper.getWritableDatabase();
                            db.beginTransaction();
                            try {
                                for (Map.Entry<String, Divisas> entry : divisasMap.entrySet()) {
                                    Divisas divisa = entry.getValue();
                                    ContentValues values = new ContentValues();
                                    values.put("name", divisa.getName());
                                    values.put("high", divisa.getHigh());
                                    values.put("low", divisa.getLow());

                                    db.insert("tabla_divisas", null, values); // Nombre de la tabla corregido
                                }
                                db.setTransactionSuccessful();
                            } finally {
                                db.endTransaction();
                                db.close();
                            }

                            // Actualizar el TextView con los datos obtenidos
                            mostrarDatosObtenidos();
                        } else {
                            salida.setText("No se pudo obtener la información.");
                        }
                    }

                    @Override
                    public void onFailure(Call<Map<String, Divisas>> call, Throwable t) {
                        salida.setText("Error: " + t.getMessage());
                    }
                });
            }
        });

        // Mostrar los datos guardados en la base de datos
        mostrarDatosObtenidos();

        return view;
    }

    private void mostrarDatosObtenidos() {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM tabla_divisas", null); // Nombre de la tabla corregido

        StringBuilder stringBuilder = new StringBuilder();
        if (cursor != null && cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex("name"));
                double high = cursor.getDouble(cursor.getColumnIndex("high"));
                double low = cursor.getDouble(cursor.getColumnIndex("low"));

                stringBuilder.append(name).append(": ")
                        .append("High: ").append(high).append(", ")
                        .append("Low: ").append(low).append("\n");
            } while (cursor.moveToNext());
        }

        if (cursor != null) {
            cursor.close();
        }
        db.close();

        salida.setText(stringBuilder.toString());
    }
}
