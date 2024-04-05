package com.example.gonzalor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Icono2Fragment extends Fragment {

    private TextView textViewResult;
    private Map<String, Divisas> divisasMap;
    private Spinner spinnerCurrency1;
    private Spinner spinnerCurrency2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator_layout, container, false);

        EditText editTextAmount = view.findViewById(R.id.editTextAmount);
        Button buttonConvert = view.findViewById(R.id.buttonConvert);
        textViewResult = view.findViewById(R.id.textViewResult);
        spinnerCurrency1 = view.findViewById(R.id.spinnerCurrency1);
        spinnerCurrency2 = view.findViewById(R.id.spinnerCurrency2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),
                R.array.currency_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCurrency1.setAdapter(adapter);
        spinnerCurrency2.setAdapter(adapter);

        obtenerDatosDivisas();

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amount = editTextAmount.getText().toString();
                String currency1 = spinnerCurrency1.getSelectedItem().toString();
                String currency2 = spinnerCurrency2.getSelectedItem().toString();

                if (divisasMap != null && !divisasMap.isEmpty()) {
                    if (divisasMap.containsKey(currency1) && divisasMap.containsKey(currency2)) {
                        Divisas divisa1 = divisasMap.get(currency1);
                        Divisas divisa2 = divisasMap.get(currency2);

                        double rate1 = Double.parseDouble(divisa1.getHigh());
                        double rate2 = Double.parseDouble(divisa2.getHigh());
                        double inputAmount = Double.parseDouble(amount);

                        // Realizar cálculo de conversión entre divisas
                        double result = (inputAmount / rate1) * rate2;

                        // Mostrar el resultado en textViewResult
                        textViewResult.setText(String.valueOf(result)); // Muestra el resultado en texto simple
                    } else {
                        textViewResult.setText("Las divisas seleccionadas no existen en el mapa.");
                    }
                } else {
                    textViewResult.setText("El mapa de divisas está vacío o no se ha obtenido.");
                }
            }
        });

        return view;
    }

    private void obtenerDatosDivisas() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://economia.awesomeapi.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API apiService = retrofit.create(API.class);

        Call<Map<String, Divisas>> call = apiService.getDivisas();

        call.enqueue(new Callback<Map<String, Divisas>>() {
            @Override
            public void onResponse(Call<Map<String, Divisas>> call, Response<Map<String, Divisas>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    divisasMap = response.body();
                }
            }

            @Override
            public void onFailure(Call<Map<String, Divisas>> call, Throwable t) {
                // Manejar errores en la obtención de datos
                textViewResult.setText("Error al obtener las divisas: " + t.getMessage());
            }
        });
    }
}
