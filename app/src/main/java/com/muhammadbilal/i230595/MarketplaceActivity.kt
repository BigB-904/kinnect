package com.muhammadbilal.i230595

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MarketplaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marketplace)
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.btnSearch).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabHome).setOnClickListener {
            finish()
        }

        findViewById<android.widget.TextView>(R.id.tabFriends).setOnClickListener {
            startActivity(Intent(this, FriendsActivity::class.java))
            finish()
        }

        findViewById<android.widget.TextView>(R.id.tabNotifications).setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
            finish()
        }

        findViewById<android.widget.TextView>(R.id.tabMenu).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}