package com.example.m206_sharedpref_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendButton = findViewById<Button>(R.id.button)

        sendButton.setOnClickListener {

            startActivity(Intent(applicationContext, Second::class.java))


        }


    }
}