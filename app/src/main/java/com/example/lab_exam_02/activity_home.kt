package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val HomePageFood: ImageView = findViewById(R.id.homepage_food)
        HomePageFood.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }

        val HomePageAccessories: ImageView = findViewById(R.id.homepage_accessories)
        HomePageAccessories.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }

        val HomePageHealth: ImageView = findViewById(R.id.homepage_health)
        HomePageHealth.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }

        val home_home: ImageView = findViewById(R.id.home_home)
        home_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val home_health: ImageView = findViewById(R.id.home_health)
        home_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val home_shop: ImageView = findViewById(R.id.home_shop)
        home_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val home_profile: ImageView = findViewById(R.id.home_profile)
        home_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}