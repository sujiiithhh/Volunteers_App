package com.example.volunteers_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volunteers_app.databinding.ActivityIntro2Binding
import com.example.volunteers_app.databinding.ActivityIntroductionBinding

class IntroActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityIntro2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntro2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            val intent = Intent(this, IntroActivity3::class.java)
            startActivity(intent)
        }
    }
}