package com.example.srivastavs.androhive.endpoint;

import com.example.srivastavs.androhive.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by srivastavs on 16/01/18.
 */

public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieResponse> getMovies(@Query("api_key") String api_key);
}
