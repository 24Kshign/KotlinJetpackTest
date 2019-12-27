package com.example.kotlinjetpacktest.viewmodel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinjetpacktest.R
import com.example.kotlinjetpacktest.bean.Result
import com.example.kotlinjetpacktest.viewmodel.viewmodel.ArticleViewModel
import kotlinx.android.synthetic.main.activity_viewmodel_livedata.*

class ViewModelLiveDataActivity : AppCompatActivity() {

    private lateinit var articleViewModel: ArticleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel_livedata)
        articleViewModel = ViewModelProvider(this).get(ArticleViewModel::class.java)
        initView()
        loadData()
        observer()
    }

    private fun initView() {
        avl_load_data_btn.setOnClickListener {
            loadData()
        }
    }

    private fun loadData() {
        articleViewModel.loadData()
    }

    private fun observer() {
        articleViewModel.getArticleList().observe(this,
            Observer<List<Result>> {
                avl_load_data_text.text = "长度为${it.size}"
                Toast.makeText(this, "长度为${it.size}", Toast.LENGTH_SHORT).show()
            })
    }
}