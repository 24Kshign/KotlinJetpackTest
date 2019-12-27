package com.example.kotlinjetpacktest.viewmodel.viewmodel

import androidx.arch.core.util.Function
import androidx.lifecycle.*
import com.example.kotlinjetpacktest.bean.ArticleData
import com.example.kotlinjetpacktest.bean.Result
import com.example.kotlinjetpacktest.viewmodel.repository.ArticleRepository
import kotlinx.coroutines.cancel


class ArticleViewModel : ViewModel() {

    private var articleRepository: ArticleRepository = ArticleRepository()

    fun getArticleList(): LiveData<List<Result>> {
        val liveData: MutableLiveData<ArticleData> = articleRepository.getArticleList()
        // 使用转换器将原始数据转换成我们所需要的数据进行返回
        return Transformations.switchMap(
            liveData,
            Function<ArticleData, LiveData<List<Result>>> { articleData ->
                val newLiveData = MutableLiveData<List<Result>>()
                if (articleData?.results == null) {
                    newLiveData.setValue(null)
                } else {
                    newLiveData.setValue(articleData.results)
                }
                return@Function newLiveData
            })
    }

    fun loadData() {
        articleRepository.loadData()
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }

}