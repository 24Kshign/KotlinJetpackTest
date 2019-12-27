package com.example.kotlinjetpacktest.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.kotlinjetpacktest.R

class NavigationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
    }

    // 拦截Activity的返回，交给fragment处理
    override fun onSupportNavigateUp() =
        findNavController(R.id.nav_host_fragment).navigateUp()
}