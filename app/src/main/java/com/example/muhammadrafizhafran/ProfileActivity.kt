package com.example.muhammadrafizhafran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val editprofileButton = findViewById<Button>(R.id.btn_editprofile)
        editprofileButton.setOnClickListener {
            val intent = Intent(this, EditprofileActivity::class.java)
            startActivity(intent)
    }
        val ChangeEmail1 = findViewById<TextView>(R.id.ChangeEmail1)
        ChangeEmail1.setOnClickListener {
            val intent = Intent(this, ChangemailActivity::class.java)
            startActivity(intent)
        }
        val ChangePass1 = findViewById<TextView>(R.id.ChangePassword1)
        ChangePass1.setOnClickListener {
            val intent = Intent(this, ChangepassActivity::class.java)
            startActivity(intent)
        }

    }
}