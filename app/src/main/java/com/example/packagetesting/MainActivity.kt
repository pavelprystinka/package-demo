package com.example.packagetesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.packagetestlibrary.SomeJavaClass


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText: TextView = findViewById(R.id.helloWorldText)
        helloText.setOnClickListener {
            val v = SomeJavaClass()

            val result = v.Add(1, 44)

            helloText.text = result.toString()
        }


    }
}