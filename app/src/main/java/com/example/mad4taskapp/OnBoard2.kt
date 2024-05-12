package com.example.mad4taskapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class OnBoard2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board2)


        var imageView7 = findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            var intent = Intent(this, OnBoard3::class.java)
            startActivity(intent)
            finish()
        }
    }
}