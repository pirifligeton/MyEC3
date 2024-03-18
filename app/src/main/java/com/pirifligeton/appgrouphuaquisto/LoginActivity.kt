package com.pirifligeton.appgrouphuaquisto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pirifligeton.appgrouphuaquisto.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (binding.editTextText.text.toString() == "Group0" &&
            binding.editTextText2.text.toString() == "SYS123"){
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }
}