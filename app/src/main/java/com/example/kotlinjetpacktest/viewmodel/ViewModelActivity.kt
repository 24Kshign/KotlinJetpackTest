package com.example.kotlinjetpacktest.viewmodel

import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinjetpacktest.R
import com.example.kotlinjetpacktest.viewmodel.viewmodel.TimeModel
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewModelActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        val model: TimeModel = ViewModelProvider(this).get(TimeModel::class.java)
//        val model: TimeModel = ViewModelProvider.AndroidViewModelFactory.getInstance(App.instance)
//            .create(TimeModel::class.java)
        if (model.time == 0L) {
            val startTime = SystemClock.elapsedRealtime()
            model.time = startTime
            chronometer.base = startTime
        } else {
            chronometer.base = model.time
        }
        chronometer.start()
    }
}