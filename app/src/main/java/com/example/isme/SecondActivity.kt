package com.example.isme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener{
            button1.setBackgroundResource(R.drawable.button_pressed)
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra("from", "1")
            startActivity(intent)
            finish()



        }
        button2.setOnClickListener{
            button2.setBackgroundResource(R.drawable.button_pressed)
            val intent = Intent(this, QuizQuestionsActivity::class.java).putExtra("from", "2")

            startActivity(intent)
            finish()


        }
        button3.setOnClickListener{
            button3.setBackgroundResource(R.drawable.button_pressed)
            val intent = Intent(this, QuizQuestionsActivity::class.java).putExtra("from", "3")

            startActivity(intent)
            finish()

        }
        button4.setOnClickListener{
            button4.setBackgroundResource(R.drawable.button_pressed)
            val intent = Intent(this, QuizQuestionsActivity::class.java).putExtra("from", "4")

            startActivity(intent)
            finish()

        }
    }
}