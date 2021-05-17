package com.example.isme

object Constants{
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(1,
            "What is the name of this painting?",
            R.drawable.reneissance,
            "Athenian School",
            "Pieta",
            "Bazilica San Pietro",
            "The fall of Man",
            1
        )
        questionList.add(que1)

        //que2
        //que3
        //que4
        //que5
        //que6
        //que7
        return questionList

    }
}