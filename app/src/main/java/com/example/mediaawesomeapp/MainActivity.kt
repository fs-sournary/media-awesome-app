package com.example.mediaawesomeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mediaawesomeapp.ext.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        } // else, need to wait for onRestoreInstanceState
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {
        val navGraphIds = listOf(
            R.navigation.nav_my_music,
            R.navigation.nav_home,
            R.navigation.nav_chart,
            R.navigation.nav_mv,
            R.navigation.nav_following
        )

        val controller = bottomNavigationView?.setupWithNavController(
            navGraphIds = navGraphIds,
            containerId = R.id.nav_host_container,
            fragmentManager = supportFragmentManager,
            intent = intent
        )

        setDefaultSelectedBottomNavigation()
    }

    private fun setDefaultSelectedBottomNavigation() {
        bottomNavigationView?.selectedItemId = R.id.nav_home
    }
}
