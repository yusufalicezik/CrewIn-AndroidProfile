package com.example.crewin_android.Service;

import com.example.crewin_android.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestInterface {
    @POST
    Call<List<User>> getUser(@Query("kullanici_id") int id);

    @POST("genel_bilgiler?kullanici_id=1")
    Call<List<User>> getUserDeneme();
}
