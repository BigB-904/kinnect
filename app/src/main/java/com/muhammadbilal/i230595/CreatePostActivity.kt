package com.muhammadbilal.i230595

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CreatePostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        findViewById<android.widget.TextView>(R.id.btnClose).setOnClickListener {
            finish()
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.LinearLayout>(R.id.rowPhotoVideo).setOnClickListener {
            startActivity(Intent(this, PhotoPickerActivity::class.java))
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.LinearLayout>(R.id.rowCamera).setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}