package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnNext2: Button = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent = Intent(this, activity_onboarding3::class.java)
            startActivity(intent)
        }

        val btnSkip2: Button = findViewById(R.id.btnSkip2)
        btnSkip2.setOnClickListener {
            val intent = Intent(this, activity_onboarding3::class.java)
            startActivity(intent)
        }
    }
}