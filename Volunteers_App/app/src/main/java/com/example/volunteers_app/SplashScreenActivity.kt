package com.example.volunteers_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volunteers_app.databinding.ActivitySignInBinding
import com.example.volunteers_app.databinding.ActivitySplashScreenBinding
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        img1.alpha = 0f

        img1.animate().setDuration(1500).alpha(1f).withEndAction {

            val intent = Intent(this, SignInActivity::class.java)

            startActivities(arrayOf(intent))

            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)

            finish()
        }
    }
}