package com.mcgregor.triviaapp.network

import com.mcgregor.triviaapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
//dao
interface QuestionApi {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}