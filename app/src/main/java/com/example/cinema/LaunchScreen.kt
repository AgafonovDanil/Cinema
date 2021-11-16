package com.example.cinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlin.system.measureTimeMillis

class LaunchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_screen)
        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) { //во время работы таймера

            }

            override fun onFinish() { //после времени таймера
                //переход на др экран

                val intent = Intent(this@LaunchScreen, MainActivity::class.java)
                //активация перехода
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}