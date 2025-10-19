package com.dibdroid.intentpassing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val etName = findViewById<EditText>(R.id.etName)
        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {

            val name = etName.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_name", name)
            startActivity(intent)

        }

            
        }

        }



//val etName = findViewById<EditText>(R.id.etName)
//val btnNext = findViewById<Button>(R.id.btnNext)

//btnNext.setOnClickListener {
  //  val name = etName.text.toString()
   // val intent = Intent(this,SecondActivity::class.java)
    //intent.putExtra("user_name",name)
   // startActivity(intent)
