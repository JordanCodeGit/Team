package com.example.team

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentButton: Button = findViewById(R.id.buttonIntent)
        intentButton.setOnClickListener { viewDetail() }
        val intentButton2: Button = findViewById(R.id.buttonIntent2)
        intentButton2.setOnClickListener {viewDetail2() }
        val intentButton3: Button = findViewById(R.id.buttonIntent3)
        intentButton3.setOnClickListener { viewDetail3() }
        val intentButton4: Button = findViewById(R.id.buttonIntent4)
        intentButton4.setOnClickListener { viewDetail4() }
    }

    private fun viewDetail() {
        val intent = Intent(this, JordanCode::class.java)
        startActivity(intent)
    }
    private fun viewDetail2() {
        val intent = Intent(this, AxelCode::class.java)
        startActivity(intent)
    }
    private fun viewDetail3() {
        val intent = Intent(this, MutiCode::class.java)
        startActivity(intent)
    }
    private fun viewDetail4() {
        val intent = Intent(this, NadiyaCode::class.java)
        startActivity(intent)
    }
}

