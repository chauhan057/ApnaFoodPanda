package com.example.apnafoodpanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apnafoodpanda.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private val binding: ActivityStartBinding by lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
// setContentView(R.layout.activity_start)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            val i =Intent(this,LoginActivity::class.java)
         startActivity(i)
            finish()
        }


    }
}