package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val paymentArrowBack: ImageView = findViewById(R.id.paymentArrowBack)
        paymentArrowBack.setOnClickListener {
            val intent = Intent(this, activity_delivery::class.java)
            startActivity(intent)
        }
        val btnPay: Button = findViewById(R.id.btnPay)
        btnPay.setOnClickListener {
            val intent = Intent(this, activity_order_confirmed::class.java)
            startActivity(intent)
        }

        val payment_home: ImageView = findViewById(R.id.payment_home)
        payment_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val payment_health: ImageView = findViewById(R.id.payment_health)
        payment_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val payment_shop: ImageView = findViewById(R.id.payment_shop)
        payment_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val payment_profile: ImageView = findViewById(R.id.payment_profile)
        payment_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}