package com.dicoding.bajp.yandi

import com.dicoding.bajp.yandi.data.response.NetworkConnectionInterceptor
import com.dicoding.bajp.yandi.data.response.movie.MovieDetailResponse
import com.dicoding.bajp.yandi.data.response.movie.MovieResponse
import com.dicoding.bajp.yandi.data.response.tv_show.TvShowDetailResponse
import com.dicoding.bajp.yandi.data.response.tv_show.TvShowResponse
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiHelper {

    @GET("discover/movie")
    suspend fun getAllMovie(@Query("api_key") apiKey: String?) : Response<MovieResponse>

    @GET("discover/tv")
    suspend fun getAllTvShow(@Query("api_key") apiKey: String?) : Response<TvShowResponse>

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") id: Int,
        @Query("api_key") key: String,
    ): Response<MovieDetailResponse>

    @GET("tv/{tv_id}")
    suspend fun getTvShowDetails(
        @Path("tv_id") id: Int,
        @Query("api_key") key: String,
    ): Response<TvShowDetailResponse>

    companion object {
        operator fun invoke(interceptor: NetworkConnectionInterceptor): ApiHelper {
            val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor)
                .build()

            return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiHelper::class.java)
        }
    }


}