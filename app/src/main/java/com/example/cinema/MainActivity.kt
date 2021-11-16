package com.example.cinema

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.regex.Pattern.compile

class MainActivity : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email=findViewById(R.id.email)
        password=findViewById(R.id.password)
    }
    val paternt =("[a-z0-9]{1,256}" +
            "\\@" +
            "[a-z]{1,10}" +
            "\\." +
            "[a-z]{1,3}")
    fun EmailValid (email:String):Boolean {
        return compile(paternt).matcher(email).matches()
    }


    fun login(view: android.view.View) {
        val intent= Intent (this, SignUp::class.java)
        startActivity(intent)
    }

    fun open(view: android.view.View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            if (EmailValid((email.text.toString()))) {
                val intent = Intent(this, MainScreen::class.java)
                startActivity(intent)
            } else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Неверный формат Email")
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
            }
        }
    }
}