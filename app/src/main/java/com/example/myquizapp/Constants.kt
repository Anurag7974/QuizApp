package com.example.myquizapp

import android.view.inputmethod.CorrectionInfo

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(
           1, "What country does this flag belong to?",
           R.drawable.unkindom,
           "United Kingdom","China","Russia","Mexico",
           1
        )
        questionList.add(ques1)

        val ques2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Germany","America","China","Russia",
            3
        )
              questionList.add(ques2)

        val ques3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Italy","India","Canada","China",
            2
        )
        questionList.add(ques3)

        val ques4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Canada","Italy","Colombia","Mexico",
            4
        )
        questionList.add(ques4)

        val ques5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "India","America","China","Germany",
            2
        )
        questionList.add(ques5)

        val ques6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Canada","Mexico","Russia","India",
            1
        )
        questionList.add(ques6)

        val ques7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "China","Germany","Italy","America",
            3
        )
        questionList.add(ques7)

        val ques8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Thailand","Russia","Netherlands","Cuba",
            2
        )
        questionList.add(ques8)

        val ques9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Egypt","Poland","Iran","Germany",
            4
        )
        questionList.add(ques9)

        val ques10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.germanyflag,
            "Colombia","Norway","Iran","Poland",
            1
        )
        questionList.add(ques10)

        return questionList
    }
}