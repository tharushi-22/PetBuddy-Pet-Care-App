package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnNext1: Button = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent = Intent(this, activity_onboarding2::class.java)
            startActivity(intent)
        }

        val btnSkip1: Button = findViewById(R.id.btnSkip1)
        btnSkip1.setOnClickListener {
            val intent = Intent(this, activity_onboarding3::class.java)
            startActivity(intent)
        }
    }
}