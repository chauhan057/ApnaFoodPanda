package com.example.apnafoodpanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnafoodpanda.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    private  val binding:ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_signup)
        setContentView(binding.root)
        binding.createAccountBtn.setOnClickListener {
            val i =Intent(this,LoginActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}