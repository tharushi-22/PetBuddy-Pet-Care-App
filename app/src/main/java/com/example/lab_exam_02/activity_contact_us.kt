package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_contact_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contact_us)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val contactHome: ImageView = findViewById(R.id.contact_home)
        contactHome.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val contactHealth: ImageView = findViewById(R.id.contact_health)
        contactHealth.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val contactShop: ImageView = findViewById(R.id.contact_shop)
        contactShop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val contactProfile: ImageView = findViewById(R.id.contact_profile)
        contactProfile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
        val contactUsArrowBack: ImageView = findViewById(R.id.contactUsArrowBack)
        contactUsArrowBack.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}