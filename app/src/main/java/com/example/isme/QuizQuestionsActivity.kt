package com.example.isme

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*


class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var zCurrentPosition: Int = 1
    private var zQuestionsList: ArrayList<Question>? = null
    private var zSelectedOptionPosition: Int = 0
    private var zCorrectAnswers: Int = 0
    private var zUserName: String? = null
    private var selectedQuiz: String? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

         zUserName = intent.getStringExtra(Constants.USER_NAME)

         selectedQuiz = intent.getStringExtra("from" )
         when{
             selectedQuiz.equals("1")->{zQuestionsList= Constants.getQuestions()}
            selectedQuiz.equals("2")->{
                zQuestionsList = Constants.getQuestionsRococo()
            }
            selectedQuiz.equals("3")-> {
                zQuestionsList = Constants.getQuestionNineteen()
            }
            selectedQuiz.equals("4")->{
                zQuestionsList = Constants.getQuestionModernism()
            }
        }

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        val question = zQuestionsList!![zCurrentPosition-1]

        defaultOptionsView()
        if(zCurrentPosition == zQuestionsList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text = "SUBMIT"
        }
        progressBar.max = zQuestionsList!!.size
        progressBar.progress = zCurrentPosition
        tv_progress.text = "$zCurrentPosition" + "/" + progressBar.max

        tv_question.text = question.question

        question.image?.let { iv_image.setImageResource(it)}

        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option
            )
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit -> {
                if (zSelectedOptionPosition == 0) {
                    zCurrentPosition++

                    when {
                        zCurrentPosition <= zQuestionsList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                           val intent = Intent(this, Result::class.java)
                            intent.putExtra(Constants.USER_NAME, zUserName)
                            intent.putExtra(Constants.CORRECT_ANSWERS, zCorrectAnswers)
                            intent.putExtra(Constants.TOTAL_QUESTIONS, zQuestionsList!!.size)
                            intent.putExtra(Constants.CATEGORY, selectedQuiz)
                            startActivity(intent)
                            finish()

                        }
                    }
                } else {
                    val question = zQuestionsList?.get(zCurrentPosition - 1)
                    if (question!!.correctAnswer != zSelectedOptionPosition) {
                        answerView(zSelectedOptionPosition, R.drawable.wrong_option)
                    }else{zCorrectAnswers++}
                    answerView(question.correctAnswer, R.drawable.correct_option)

                    //Button at end of the quiz
                    if(zCurrentPosition == zQuestionsList!!.size){
                        btn_submit.text = "FINISH"
                    }else{
                        btn_submit.text = "NEXT QUESTION"
                    }
                    zSelectedOptionPosition = 0
                }

        }
    }

}

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1->{
                tv_option_one.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            2->{
                tv_option_two.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            3->{
                tv_option_three.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            4->{
                tv_option_four.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int){
        defaultOptionsView()
        zSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option)


    }
}