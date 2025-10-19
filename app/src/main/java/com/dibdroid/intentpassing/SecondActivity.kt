package com.dibdroid.intentpassing

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

       val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val name = intent.getStringExtra("user_name")
        tvWelcome.text = "Welcome! , $name!"



        }
    }

//val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

//val name = intent.getStringExtra("user_name")
//tvWelcome.text = "Welcome, $name!"
