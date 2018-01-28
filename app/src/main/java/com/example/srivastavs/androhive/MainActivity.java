package com.example.srivastavs.androhive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.srivastavs.androhive.endpoint.ApiInterface;
import com.example.srivastavs.androhive.model.MovieResponse;
import com.example.srivastavs.androhive.model.Movies;
import com.example.srivastavs.androhive.retroclient.RetroClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RecyclerView movies_view=(RecyclerView)findViewById(R.id.recycler_movies);
        movies_view.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiInterface = RetroClient.getClient().create(ApiInterface.class);

        Call<MovieResponse> call = apiInterface.getMovies("8155a73d1352ee6551cf84eed0cef43d");

        call.enqueue(new Callback<MovieResponse>() {
            @Override
            public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                List<Movies> movies = response.body().getMovieResult();
                Log.d("Recieve","Movie Size recieved "+movies.size());
                movies_view.setAdapter(new MoviesAdapter(getApplicationContext(),movies,R.layout.list_item_movie));
            }

            @Override
            public void onFailure(Call<MovieResponse> call, Throwable t) {

            }
        });
    }
}
