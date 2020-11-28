package com.dicoding.bajp.yandi.data.response.movie

import com.google.gson.annotations.SerializedName

data class MovieResult(

	@field:SerializedName("overview")
	val overview: String?,

	@field:SerializedName("original_title")
	val originalTitle: String?,

	@field:SerializedName("release_date")
	val releaseDate: String?,

	@field:SerializedName("vote_average")
	val voteAverage: Double?,

	@field:SerializedName("title")
	val title: String?,

	@field:SerializedName("poster_path")
	val posterPath: String?
)
