package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_delivery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delivery)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val deliveryArrowBack: ImageView = findViewById(R.id.deliveryArrowBack)
        deliveryArrowBack.setOnClickListener {
            val intent = Intent(this, activity_cart::class.java)
            startActivity(intent)
        }
        val btnProceedToPayment: Button = findViewById(R.id.btnProceedToPayment)
        btnProceedToPayment.setOnClickListener {
            val intent = Intent(this, activity_payment::class.java)
            startActivity(intent)
        }

        val delivery_home: ImageView = findViewById(R.id.delivery_home)
        delivery_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val delivery_health: ImageView = findViewById(R.id.delivery_health)
        delivery_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val delivery_shop: ImageView = findViewById(R.id.delivery_shop)
        delivery_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val delivery_profile: ImageView = findViewById(R.id.delivery_profile)
        delivery_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}