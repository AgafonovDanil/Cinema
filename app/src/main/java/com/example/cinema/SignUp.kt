package com.example.cinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

    }
    
    fun back(view: android.view.View) {
        val intent= Intent (this, MainActivity::class.java)
        startActivity(intent)
    }

}