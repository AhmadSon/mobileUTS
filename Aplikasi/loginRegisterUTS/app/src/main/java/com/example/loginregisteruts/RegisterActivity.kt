package com.example.loginregisteruts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.R_img_2
import kotlinx.android.synthetic.main.activity_register.txt_login

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        txtLoginListener()
        btnBackListener()
    }
    private fun txtLoginListener(){
        txt_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun btnBackListener(){
        R_img_2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}