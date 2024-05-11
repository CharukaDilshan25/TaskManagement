package com.example.mad4taskapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Logo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // Delay the launch of the OnBoard1 activity by 2 seconds
        Handler().postDelayed({
            // Create an Intent to launch the OnBoard1 activity
            val intent = Intent(this, OnBoard1::class.java)
            startActivity(intent)
            // Finish the Logo activity to prevent it from being shown again when back button is pressed
            finish()
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}
