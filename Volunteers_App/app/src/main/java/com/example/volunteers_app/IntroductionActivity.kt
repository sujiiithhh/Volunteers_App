package com.example.volunteers_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volunteers_app.databinding.ActivityIntroductionBinding
import com.example.volunteers_app.databinding.ActivitySignInBinding

class IntroductionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroductionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroductionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            val intent = Intent(this, IntroActivity2::class.java)
            startActivity(intent)
        }
    }
}