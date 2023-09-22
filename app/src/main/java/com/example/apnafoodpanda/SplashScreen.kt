package com.example.apnafoodpanda

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screeen)
        Handler().postDelayed({
            val i = Intent(this,StartActivity::class.java)
                    startActivity(i)
                finish()
        },3000)

    }
}