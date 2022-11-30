package com.example.volunteers_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volunteers_app.databinding.ActivityIntro2Binding
import com.example.volunteers_app.databinding.ActivityIntro4Binding

class IntroActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityIntro4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntro4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}