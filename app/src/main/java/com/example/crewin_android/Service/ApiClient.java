package com.example.crewin_android.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit=null;
    private static String Base_Url= "http://54.246.167.221:90/api/v1/values/";
    public static Retrofit getClient(){
        if(retrofit== null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


            return retrofit;
        }
        return retrofit;

    }//ApiClient.class
}
