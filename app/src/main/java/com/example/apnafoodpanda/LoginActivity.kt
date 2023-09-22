package com.example.apnafoodpanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.apnafoodpanda.databinding.ActivityLoginActivityBinding

class LoginActivity : AppCompatActivity() {
//    private  val binding: Log/in
    private val binding : ActivityLoginActivityBinding by lazy {
        ActivityLoginActivityBinding.inflate(layoutInflater)
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login_activity)
    setContentView(binding.root)
        binding.loginBtn.setOnClickListener {
            val i =Intent(this,SignupActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}