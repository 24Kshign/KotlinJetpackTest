package com.example.kotlinjetpacktest.viewmodel.repository

import androidx.lifecycle.MutableLiveData
import com.example.kotlinjetpacktest.bean.ArticleData
import com.example.kotlinjetpacktest.util.UnicodeUtil
import com.google.gson.Gson
import okhttp3.*
import java.io.IOException

class ArticleRepository {

    val liveData: MutableLiveData<ArticleData> = MutableLiveData()

    fun loadData() {
        val client = OkHttpClient.Builder()
            .build()
        val request = Request.Builder()
            .url("http://gank.io/api/data/Android/10/1")
            .build()
        val call = client.newCall(request)
        call.enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                liveData.postValue(null)
            }

            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val jsonStr = UnicodeUtil.decodeUnicode(response.body()?.string() ?: "")
                    val gson = Gson()
                    liveData.postValue(gson.fromJson<ArticleData>(jsonStr, ArticleData::class.java))
                } else {
                    liveData.postValue(null)
                }
            }
        })
    }

    fun getArticleList():MutableLiveData<ArticleData> {
        return liveData
    }
}