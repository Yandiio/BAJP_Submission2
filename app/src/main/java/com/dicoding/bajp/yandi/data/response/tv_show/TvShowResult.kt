package com.dicoding.bajp.yandi.data.response.tv_show

import com.google.gson.annotations.SerializedName

data class TvShowResult(

	@field:SerializedName("first_air_date")
	val firstAirDate: String? = null,

	@field:SerializedName("overview")
	val overview: String? = null,

	@field:SerializedName("original_name")
	val originalName: String? = null,

	@field:SerializedName("vote_average")
	val voteAverage: Double? = null,

	@field:SerializedName("vote_count")
	val voteCount: Int? = null,

	@field:SerializedName("poster_path")
	val posterPath: String? = null
)
