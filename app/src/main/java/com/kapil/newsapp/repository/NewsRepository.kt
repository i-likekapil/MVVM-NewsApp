package com.kapil.newsapp.repository

import com.kapil.newsapp.api.RetrofitInstance
import com.kapil.newsapp.database.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.getSearchNews(searchQuery, pageNumber)
}