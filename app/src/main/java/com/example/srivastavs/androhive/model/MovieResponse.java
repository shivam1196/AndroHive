package com.example.srivastavs.androhive.model;

import android.graphics.Movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by srivastavs on 16/01/18.
 */

public class MovieResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Movies> movieResult;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movies> getMovieResult() {
        return movieResult;
    }

    public void setMovieResult(List<Movies> movieResult) {
        this.movieResult = movieResult;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
