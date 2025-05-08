package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_health : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_health)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val healthArrowBack: ImageView = findViewById(R.id.healthArrowBack)
        healthArrowBack.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val btnAddVacc: Button = findViewById(R.id.btnAddVacc)
        btnAddVacc.setOnClickListener {
            val intent = Intent(this, activity_vaccinations::class.java)
            startActivity(intent)
        }
        val btnAddTreat: Button = findViewById(R.id.btnAddTreat)
        btnAddTreat.setOnClickListener {
            val intent = Intent(this, activity_treatments::class.java)
            startActivity(intent)
        }

        val health_home: ImageView = findViewById(R.id.health_home)
        health_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val health_health: ImageView = findViewById(R.id.health_health)
        health_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val health_shop: ImageView = findViewById(R.id.health_shop)
        health_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val health_profile: ImageView = findViewById(R.id.health_profile)
        health_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}