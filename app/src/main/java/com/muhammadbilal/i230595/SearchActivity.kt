package com.muhammadbilal.i230595

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        findViewById<android.widget.TextView>(R.id.btnBack).setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.LinearLayout>(R.id.rowOmarFarooq).setOnClickListener {
            startActivity(Intent(this, OtherProfileActivity::class.java))
        }
    }
}