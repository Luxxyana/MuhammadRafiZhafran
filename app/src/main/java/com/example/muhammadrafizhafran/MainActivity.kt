package com.example.muhammadrafizhafran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.muhammadrafizhafran.RegActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<Button>(R.id.button_reg)
        loginButton.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }

        val MainMenuButton = findViewById<Button>(R.id.Btn_login)
        MainMenuButton.setOnClickListener {
            val intent = Intent(this, MainmenuActivity::class.java)
            startActivity(intent)
        }
        val ForgotPass = findViewById<TextView>(R.id.forgotpass1)
        ForgotPass.setOnClickListener {
            val intent = Intent(this, ForgotpasswordActivity::class.java)
            startActivity(intent)
        }
    }
}