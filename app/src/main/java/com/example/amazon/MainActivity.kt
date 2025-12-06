package com.example.amazon

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.example.amazon.databinding.ActivityMainBinding // Import the binding class
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Declare the binding object
    private var keepSplash = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Handle Splash Screen
        installSplashScreen().setKeepOnScreenCondition { keepSplash }
        lifecycleScope.launch {
            delay(3000)
            keepSplash = false
        }

        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Use the classic way to handle edge-to-edge drawing
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // --- THIS IS THE FIX ---
        // The following line is removed because there is no Toolbar with the id 'topAppBar' anymore.
        // setSupportActionBar(binding.topAppBar)
    }

    // This method is no longer needed if you don't have a Toolbar acting as an ActionBar.
    // You can remove it or leave it, but it won't do anything without a setSupportActionBar call.
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }
}


