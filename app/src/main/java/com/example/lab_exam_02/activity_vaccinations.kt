package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_vaccinations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vaccinations)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val vaccinationArrowBack: ImageView = findViewById(R.id.vaccinationArrowBack)
        vaccinationArrowBack.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val btnVaccAdd: Button = findViewById(R.id.btnVaccAdd)
        btnVaccAdd.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }

        val vaccinations_home: ImageView = findViewById(R.id.vaccinations_home)
        vaccinations_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val vaccinations_health: ImageView = findViewById(R.id.vaccinations_health)
        vaccinations_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val vaccinations_shop: ImageView = findViewById(R.id.vaccinations_shop)
        vaccinations_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val vaccinations_profile: ImageView = findViewById(R.id.vaccinations_profile)
        vaccinations_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}