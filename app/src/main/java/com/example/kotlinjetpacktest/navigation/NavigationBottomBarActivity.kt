package com.example.kotlinjetpacktest.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.kotlinjetpacktest.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationBottomBarActivity : AppCompatActivity() {

    private lateinit var bottomNavigationBar: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bottom_bar)
        val host: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.anbb_nav_host_fragment) as NavHostFragment
        val navController = host.navController
        bottomNavigationBar = findViewById(R.id.anbb_bottom_bar)
        bottomNavigationBar.setupWithNavController(navController)
    }
}
