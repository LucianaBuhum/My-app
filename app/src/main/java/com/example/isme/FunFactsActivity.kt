package com.example.isme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fun_facts.*

class FunFactsActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        val cat = intent.getStringExtra(Constants.CATEGORY)
       // tv_category.text = "Your Category is $cat"
    when{
        cat.equals("1")-> {tv_fact_one.text=Constants.FUN_FACT_RENAISSANCE_ONE
                                tv_fact_two.text=Constants.FUN_FACT_RENAISSANCE_TWO
                                tv_fact_three.text = Constants.FUN_FACT_RENAISSANCE_THREE
                                tv_fact_four.text = Constants.FUN_FACT_RENAISSANCE_FOUR
                                tv_fact_five.text = Constants.FUN_FACT_RENAISSANCE_FIVE
                                iv_image_fact.setImageResource(R.drawable.venus)}
        cat.equals("2")->{tv_fact_one.text= Constants.FUN_FACT_ROCOCO_ONE
                               tv_fact_two.text = Constants.FUN_FACT_ROCOCO_TWO
                                tv_fact_three.text= Constants.FUN_FACT_BAROC_THREE
                                tv_fact_four.text= Constants.FUN_FACT_BAROC_FOUR
                                tv_fact_five.text= Constants.FUN_FACT_BAROC_FIVE
                                iv_image_fact.setImageResource(R.drawable.rococo)}
        cat.equals("3")->{tv_fact_one.text= Constants.FUN_FACT_NINETH_ONE
                                tv_fact_two.text = Constants.FUN_FACT_NINETH_TWO
                                tv_fact_three.text = Constants.FUN_FACT_NINETH_THREE
                                tv_fact_four.text = Constants.FUN_FACT_NINETH_FOUR
                                tv_fact_five.text =Constants.FUN_FACT_BAROC_FIVE
                                iv_image_fact.setImageResource(R.drawable.womanwithparasol)}

        cat.equals("4")->{tv_fact_one.text= Constants.FUN_FACT_MODERNISM_ONE
                                tv_fact_two.text= Constants.FUN_FACT_MODERNISM_TWO
                                tv_fact_three.text= Constants.FUN_FACT_MODERNISM_THREE
                                tv_fact_four.text= Constants.FUN_FACT_MODERNISM_FOUR
                                tv_fact_five.text= Constants.FUN_FACT_MODERNISM_FIVE
                                iv_image_fact.setImageResource(R.drawable.birthogliquiddesires)}





    }


        fun_Btn.setOnClickListener{
        val intent = Intent (this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}