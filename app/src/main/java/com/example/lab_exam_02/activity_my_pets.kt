package com.example.lab_exam_02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_my_pets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_pets)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAddPet: Button = findViewById(R.id.btnAddPet)
        btnAddPet.setOnClickListener {
            val intent = Intent(this, activity_add_pet::class.java)
            startActivity(intent)
        }

        val mypetInfoImg: ImageView = findViewById(R.id.mypet_info_img)
        mypetInfoImg.setOnClickListener {
            val intent = Intent(this, activity_pet_info::class.java)
            startActivity(intent)
        }

        val myPetsArrowBack: ImageView = findViewById(R.id.myPetsArrowBack)
        myPetsArrowBack.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }

        val myPets_home: ImageView = findViewById(R.id.myPets_home)
        myPets_home.setOnClickListener {
            val intent = Intent(this, activity_home::class.java)
            startActivity(intent)
        }
        val myPets_health: ImageView = findViewById(R.id.myPets_health)
        myPets_health.setOnClickListener {
            val intent = Intent(this, activity_health::class.java)
            startActivity(intent)
        }
        val myPets_shop: ImageView = findViewById(R.id.myPets_shop)
        myPets_shop.setOnClickListener {
            val intent = Intent(this, activity_shop::class.java)
            startActivity(intent)
        }
        val myPets_profile: ImageView = findViewById(R.id.myPets_profile)
        myPets_profile.setOnClickListener {
            val intent = Intent(this, activity_profile::class.java)
            startActivity(intent)
        }
    }
}