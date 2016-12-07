package com.iamdeveloper.androidretrofit.rest;

import com.iamdeveloper.androidretrofit.model.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by IamDeveloper on 11/10/2016.
 */

public interface PostInterface {
    @GET("posts")
    Call<List<model>> getPosts();
}
