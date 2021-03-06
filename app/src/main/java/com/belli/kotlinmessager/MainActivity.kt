package com.belli.kotlinmessager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button_register.setOnClickListener {
            val email = email_editText_register.text.toString()
            val password = password_editText_register.text.toString()
            Log.d("MainActivity", "Email is: $email")
            Log.d("MainActivity", "Password is: $password")
        }

        // Launch Login activity
        alreadyAcount_textView_register.setOnClickListener {
            Log.d("MainActivity", "Login Activity")

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}