package com.example.isme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*


class Result : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val category = intent.getStringExtra(Constants.CATEGORY)
        val totalQ = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Score: $correctAns / $totalQ "
        finishBtn.setOnClickListener{
            val intent = Intent(this, FunFactsActivity::class.java)
            intent.putExtra(Constants.CATEGORY, category)

            startActivity(intent)
            finish()
        }
    }
}