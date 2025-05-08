package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_treatments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_treatments)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val treatmentArrowBack: ImageView = findViewById(R.id.treatmentArrowBack)
        treatmentArrowBack.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val btnTreatAdd: Button = findViewById(R.id.btnTreatAdd)
        btnTreatAdd.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }

        val treatments_home: ImageView = findViewById(R.id.treatments_home)
        treatments_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val treatments_health: ImageView = findViewById(R.id.treatments_health)
        treatments_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val treatments_shop: ImageView = findViewById(R.id.treatments_shop)
        treatments_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val treatments_profile: ImageView = findViewById(R.id.treatments_profile)
        treatments_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}