package com.dicoding.bajp.yandi.data

import com.dicoding.bajp.yandi.data.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiHelper {

    @GET("discover/movie")
    suspend fun getAllMovie(@Query("api_key") apiKey: String?) : Response<MovieResponse>
}