package com.muhammadbilal.i230595

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.btnCreateAccount).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

        findViewById<android.widget.Button>(R.id.btnLogin).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }
}