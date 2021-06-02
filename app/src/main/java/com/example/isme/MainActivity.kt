package com.example.isme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val mainBtn = findViewById<Button>(R.id.mainBtn)
        mainBtn.setOnClickListener{

                val intent = Intent(this, SecondActivity::class.java)

                startActivity(intent)
                finish()


        }
    }
}