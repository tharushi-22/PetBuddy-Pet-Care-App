package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEditProfile: Button = findViewById(R.id.btnEditProfile)
        btnEditProfile.setOnClickListener {
            val intent = Intent(this, activity_edit_profile::class.java)
            startActivity(intent)
        }
        val btnMyPets: Button = findViewById(R.id.btnMyPets)
        btnMyPets.setOnClickListener {
            val intent = Intent(this, activity_my_pets::class.java)
            startActivity(intent)
        }
        val btnMyExpenses: Button = findViewById(R.id.btnMyExpenses)
        btnMyExpenses.setOnClickListener {
            val intent = Intent(this, activity_my_expenses::class.java)
            startActivity(intent)
        }
        val btnContactUs: Button = findViewById(R.id.btnContactUs)
        btnContactUs.setOnClickListener {
            val intent = Intent(this, activity_contact_us::class.java)
            startActivity(intent)
        }
        val btnLogOut: Button = findViewById(R.id.btnLogOut)
        btnLogOut.setOnClickListener {
            val intent = Intent(this, activity_log_in::class.java)
            startActivity(intent)
        }

        val profileArrowBack: ImageView = findViewById(R.id.profileArrowBack)
        profileArrowBack.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }

        val profile_home: ImageView = findViewById(R.id.profile_home)
        profile_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val profile_health: ImageView = findViewById(R.id.profile_health)
        profile_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val profile_shop: ImageView = findViewById(R.id.profile_shop)
        profile_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val profile_profile: ImageView = findViewById(R.id.profile_profile)
        profile_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}