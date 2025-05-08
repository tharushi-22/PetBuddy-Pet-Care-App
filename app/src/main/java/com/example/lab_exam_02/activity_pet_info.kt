package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_pet_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pet_info)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSave2: Button = findViewById(R.id.btnSave2)
        btnSave2.setOnClickListener {
            val intent = Intent(this, activity_my_pets::class.java)
            startActivity(intent)
        }

        val petInfoArrowBack: ImageView = findViewById(R.id.petInfoArrowBack)
        petInfoArrowBack.setOnClickListener {
            val intent = Intent(this, activity_my_pets::class.java)
            startActivity(intent)
        }

        val petInfo_home: ImageView = findViewById(R.id.petInfo_home)
        petInfo_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val petInfo_health: ImageView = findViewById(R.id.petInfo_health)
        petInfo_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val petInfo_shop: ImageView = findViewById(R.id.petInfo_shop)
        petInfo_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val petInfo_profile: ImageView = findViewById(R.id.petInfo_profile)
        petInfo_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}