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
        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalQ = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tv_name.text = username
        tv_score.text = "Your score is $correctAns / $totalQ "
        finishBtn.setOnClickListener{
            val intent = Intent(this, FunFactsActivity::class.java)
            intent.putExtra(Constants.CATEGORY, category)
            intent.putExtra(Constants.USER_NAME, username)
            startActivity(intent)
            finish()
        }
    }
}