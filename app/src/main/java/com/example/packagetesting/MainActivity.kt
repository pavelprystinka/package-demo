package com.example.packagetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.packagetestlibrary.Zoo
import com.example.packagetestlibrary.ZooClient
import com.example.packagetestlibrary.model.Cat
import com.example.packagetestlibrary.model.DogJava


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText: TextView = findViewById(R.id.helloWorldText)
        helloText.setOnClickListener {

        }

    }
}