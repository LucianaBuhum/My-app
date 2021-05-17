package com.example.isme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener(){
            button1.setBackgroundResource(R.drawable.button_pressed)
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}