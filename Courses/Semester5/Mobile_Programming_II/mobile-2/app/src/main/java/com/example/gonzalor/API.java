package com.example.gonzalor;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("/last/USD-BRL,EUR-BRL,BTC-BRL")
    Call<Map<String, Divisas>> getDivisas();
}
