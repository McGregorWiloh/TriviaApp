package com.mcgregor.triviaapp.repository

import com.mcgregor.triviaapp.model.QuestionItem
import com.mcgregor.triviaapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {

    private val listOfQuestion = ArrayList<QuestionItem>(emptyList())

}