package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_add_pet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_pet)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAdd: Button = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val intent = Intent(this, activity_my_pets::class.java)
            startActivity(intent)
        }

        val addPetArrowBack: ImageView = findViewById(R.id.addPetArrowBack)
        addPetArrowBack.setOnClickListener {
            val intent = Intent(this, activity_my_pets::class.java)
            startActivity(intent)
        }

        val addPet_home: ImageView = findViewById(R.id.addPet_home)
        addPet_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val addPet_health: ImageView = findViewById(R.id.addPet_health)
        addPet_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val addPet_shop: ImageView = findViewById(R.id.addPet_shop)
        addPet_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val addPet_profile: ImageView = findViewById(R.id.addPet_profile)
        addPet_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}