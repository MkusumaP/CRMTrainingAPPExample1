package com.example.crmtrainingappexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hi(view: View) {
        view.setOnClickListener {
            Toast.makeText(this,"hi", Toast.LENGTH_SHORT).show()
        }
    }
}
