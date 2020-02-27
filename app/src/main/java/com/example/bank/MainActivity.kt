package com.example.bank

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
//Тип коментарий
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = windowManager.defaultDisplay
        var BtnCapt:Int;
        BtnCapt = 0
        for(i in 1..10){
            val LLayout = LinearLayout(this)
            LLayout.orientation = LinearLayout.HORIZONTAL
            val Kvadrat = display.getHeight()/ 10 -3
            val marginsLeft = (display.width-(Kvadrat+4)*5)/2
            var linLayoutParam =
                LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    Kvadrat,
                    Kvadrat.toFloat()

                )

            for(i2 in 1..5){
                BtnCapt = BtnCapt+1
            val btnNew = Button(this)
                btnNew.text = BtnCapt.toString()
                btnNew.background = ContextCompat.getDrawable(this,R.drawable.btn_round)
                //btnNew.layoutParams as
                val lp = LinearLayout.LayoutParams(Kvadrat,LinearLayout.LayoutParams.WRAP_CONTENT)
                //lp.setMargins(10,0,10,0);
                lp.gravity = Gravity.CENTER
                btnNew.layoutParams = lp
                btnNew.setOnClickListener {
                    var lvbutton = it as Button

                    val toast = Toast.makeText(
                    applicationContext,
                        lvbutton.text, Toast.LENGTH_SHORT

                )
                    toast.show()
                    val intent = Intent(this,Main2Activity::class.java)
                    intent.putExtra("Button",lvbutton.text)
                    startActivity(intent)}
                    LLayout.addView(btnNew)



            }
            linLayoutParam.gravity = Gravity.CENTER;
            linLayoutParam.setMargins(marginsLeft,0,0,0);
            LLayout.layoutParams = linLayoutParam
            LL_Test.addView(LLayout)
        }
    }

    fun Clik(view: View) {
        val toast = Toast.makeText(
            applicationContext,
            "Пора покормить кота!", Toast.LENGTH_SHORT
        )
        toast.show()
    }
}

