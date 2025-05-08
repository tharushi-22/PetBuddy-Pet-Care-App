package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val iconCart: ImageView = findViewById(R.id.icon_cart)
        iconCart.setOnClickListener {
            val intent = Intent(this, activity_cart::class.java)
            startActivity(intent)
        }
        val shopArrowBack: ImageView = findViewById(R.id.shopArrowBack)
        shopArrowBack.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }

        val shop_home: ImageView = findViewById(R.id.shop_home)
        shop_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val shop_health: ImageView = findViewById(R.id.shop_health)
        shop_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val shop_shop: ImageView = findViewById(R.id.shop_shop)
        shop_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val shop_profile: ImageView = findViewById(R.id.shop_profile)
        shop_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}