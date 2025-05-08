package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_order_confirmed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_confirmed)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnContinueShopping: Button = findViewById(R.id.btnContinueShopping)
        btnContinueShopping.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val btnBackToHome: Button = findViewById(R.id.btnBackToHome)
        btnBackToHome.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
    }
}