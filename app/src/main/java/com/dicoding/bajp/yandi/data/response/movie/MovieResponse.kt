package com.dicoding.bajp.yandi.data.response.movie

import com.google.gson.annotations.SerializedName

class MovieResponse(
    @SerializedName("results")
    val results: List<MovieResult>?
)
