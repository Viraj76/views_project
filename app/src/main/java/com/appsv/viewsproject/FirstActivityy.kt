package com.appsv.viewsproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstActivityy : AppCompatActivity() {
    private val myViewModel:MainViewModel1 by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAGVIRAJ", "onCreate called 2")

        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_first_activityy)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        myViewModel.fetchData()
        val button = findViewById<TextView>(R.id.tvMain)
        button.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("TAGVIRAJ", "onStart called 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGVIRAJ", "onResume called 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGVIRAJ", "onPause called 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGVIRAJ", "onStop called 2")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAGVIRAJ", "onRestart called 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGVIRAJ", "onDestroy called 2")
    }
}