package com.example.srivastavs.androhive.retroclient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by srivastavs on 16/01/18.
 */

public class RetroClient {
    public static final String Url ="http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;
    public static Retrofit getClient()
    {
        if(retrofit ==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }
}
