package com.example.mad4taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.example.mad4taskapp.OnBoard2

class OnBoard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board1)


        var imageView4 = findViewById<ImageView>(R.id.imageView4)
        imageView4.setOnClickListener {
            var intent = Intent(this, OnBoard2::class.java)
            startActivity(intent)
            finish()
        }

    }
}
