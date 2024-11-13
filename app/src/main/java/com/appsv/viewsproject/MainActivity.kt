package com.appsv.viewsproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.appsv.viewsproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAGVIRAJ", "Activity 1: onCreate called 1")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myViewModel.fetchData()

//        val button = findViewById<TextView>(R.id.tvGo)
//        button.setOnClickListener {
//            startActivity(Intent(this, FirstActivityy::class.java))
//            finish()
//        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAGVIRAJ", "Activity 1: onStart called 1")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGVIRAJ", "Activity 1: onResume called 1")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGVIRAJ", "Activity 1: onPause called 1")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGVIRAJ", "Activity 1: onStop called 1")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAGVIRAJ", "Activity 1: onRestart called 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGVIRAJ", "Activity 1: onDestroy called 1")
    }
}
