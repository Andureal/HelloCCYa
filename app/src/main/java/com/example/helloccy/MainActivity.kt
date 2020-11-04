package com.example.helloccy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Display the UI
        //R = resource class
        setContentView(R.layout.activity_main)
    }
}