package com.example.mad4taskapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.mad4taskapp.OnBoard2

class OnBoard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_board1)

        // Find the button by its ID
        // Find the ImageButton by its ID
        val imageButton = findViewById<ImageButton>(R.id.imageView4)

        // Set click listener on the ImageButton
        imageButton.setOnClickListener {
            // Define the intent to navigate to the next activity
            val intent = Intent(this, OnBoard2::class.java)

            // Start the next activity
            startActivity(intent)
        }
    }
}
