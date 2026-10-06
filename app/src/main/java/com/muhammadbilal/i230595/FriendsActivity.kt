package com.muhammadbilal.i230595

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FriendsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.btnSearch).setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
        }

        findViewById<android.widget.TextView>(R.id.tabHome).setOnClickListener {
            finish()
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.tabMarketplace).setOnClickListener {
            startActivity(Intent(this, MarketplaceActivity::class.java))
            finish()
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.tabNotifications).setOnClickListener {
            startActivity(Intent(this, NotificationsActivity::class.java))
            finish()
        }
        // using intent to make navigation from this to the next activity

        findViewById<android.widget.TextView>(R.id.tabMenu).setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
    }
}