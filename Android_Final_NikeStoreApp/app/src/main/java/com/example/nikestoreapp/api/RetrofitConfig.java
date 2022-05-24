package com.example.nikestoreapp.api;

import com.example.nikestoreapp.model.Account;
import com.example.nikestoreapp.model.BestSeller;
import com.example.nikestoreapp.model.NewRelease;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public interface RetrofitConfig {
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    RetrofitConfig retrofit = new Retrofit.Builder()
            .baseUrl("https://nikestoreapp.000webhostapp.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(RetrofitConfig.class);

    @POST("newrealeses.php")
    Call<ArrayList<NewRelease>> getInfor_NewRealeses();

    @POST("bestseller.php")
    Call<ArrayList<BestSeller>> getInfor_BestSeller();

}
