package com.example.srivastavs.androhive;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.srivastavs.androhive.model.Movies;

import java.util.List;

/**
 * Created by srivastavs on 16/01/18.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    private List<Movies> movies;
    private int rowLayout;
    private Context context;

    public static class MovieViewHolder extends RecyclerView.ViewHolder{
        LinearLayout linearLayout;
        TextView title,description,rating,data;

        public MovieViewHolder(View v)
        {
            super(v);
            linearLayout=(LinearLayout)v.findViewById(R.id.movies_layout);
            title=(TextView)v.findViewById(R.id.title);
            description=(TextView)v.findViewById(R.id.subtitle);
            rating=(TextView)v.findViewById(R.id.rating);
            data=(TextView)v.findViewById(R.id.description);
        }}
        public MoviesAdapter(Context context,List<Movies> movies,int rowLayout)
        {
            this.context=context;
            this.movies=movies;
            this.rowLayout=rowLayout;
        }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.title.setText(movies.get(position).getTitle());
        holder.description.setText(movies.get(position).getOverview());
        holder.data.setText(movies.get(position).getRelease_date());
        holder.rating.setText(movies.get(position).getVote_average().toString());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
