package com.example.gonzalor;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class Icono3Fragment extends Fragment {

    private ListView listView;
    private DatabaseHelper databaseHelper;
    private List<String> listaDivisas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_icono3, container, false);

        listView = view.findViewById(R.id.listViewDivisas);
        databaseHelper = new DatabaseHelper(getContext());
        listaDivisas = new ArrayList<>();

        cargarDivisasDesdeDB();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, listaDivisas);
        listView.setAdapter(adapter);

        return view;
    }

    private void cargarDivisasDesdeDB() {
        SQLiteDatabase db = databaseHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT name, high, low FROM tabla_divisas", null);

        if (cursor.moveToFirst()) {
            do {
                String nombreDivisa = cursor.getString(cursor.getColumnIndex("name"));
                double high = cursor.getDouble(cursor.getColumnIndex("high"));
                double low = cursor.getDouble(cursor.getColumnIndex("low"));

                String infoDivisa = nombreDivisa + " - High: " + high + " - Low: " + low;
                listaDivisas.add(infoDivisa);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
    }
}
