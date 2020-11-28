package com.dicoding.bajp.yandi.data.response.tv_show

import com.google.gson.annotations.SerializedName

data class TvShowResponse (
    @SerializedName("results")
    val results: List<TvShowResult>
)
