package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_edit_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editProfileArrowBack: ImageView = findViewById(R.id.editProfileArrowBack)
        editProfileArrowBack.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
        val btnSave1: Button = findViewById(R.id.btnSave1)
        btnSave1.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }

        val editProfile_home: ImageView = findViewById(R.id.editProfile_home)
        editProfile_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val editProfile_health: ImageView = findViewById(R.id.editProfile_health)
        editProfile_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val editProfile_shop: ImageView = findViewById(R.id.editProfile_shop)
        editProfile_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val editProfile_profile: ImageView = findViewById(R.id.editProfile_profile)
        editProfile_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}