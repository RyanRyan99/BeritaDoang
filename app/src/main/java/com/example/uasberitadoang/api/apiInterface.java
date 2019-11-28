package com.example.uasberitadoang.api;

import com.example.uasberitadoang.models.berita;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface apiInterface {
    @GET("top-headlines")
    Call<berita> getberita(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

}
