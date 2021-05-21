package com.quizapp.api

import com.quizapp.QuestionsApi
import com.quizapp.model.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface SimpleApi {

    @GET("posts")
    fun getPosts() : Call<List<Post>>
}