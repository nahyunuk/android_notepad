package com.example.fishing_game

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.*

class MainActivity : AppCompatActivity() {
        @SuppressLint("SuspiciousIndentation")
        fun start(){
            setContentView(R.layout.activity_main)
           val btn_cre = findViewById<Button>(R.id.btn_cre)
                btn_cre.setOnClickListener{
                create_routin()
                }
        }
    fun create_routin(){
        setContentView(R.layout.activity_create_rotine)
        val file_name: String


    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        start()
    }}

