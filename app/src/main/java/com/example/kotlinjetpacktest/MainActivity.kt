package com.example.kotlinjetpacktest

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.kotlinjetpacktest.navigation.NavigationActivity
import com.example.kotlinjetpacktest.navigation.NavigationBottomBarActivity
import com.example.kotlinjetpacktest.viewmodel.ViewModelActivity
import com.example.kotlinjetpacktest.viewmodel.ViewModelLiveDataActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        am_navigation.setOnClickListener {
            startActivity(Intent(this@MainActivity, NavigationActivity::class.java))
        }

        am_bottom_navigation.setOnClickListener {
            startActivity(Intent(this@MainActivity, NavigationBottomBarActivity::class.java))
        }

        am_viewmodel.setOnClickListener {
            startActivity(Intent(this@MainActivity, ViewModelActivity::class.java))
        }

        am_viewmodel_livedata.setOnClickListener {
            startActivity(Intent(this@MainActivity, ViewModelLiveDataActivity::class.java))
        }
    }
}
