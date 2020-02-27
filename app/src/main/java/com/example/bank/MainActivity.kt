package com.example.bank

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.marginStart
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
                LLayout.addView(btnNew) }
            linLayoutParam.gravity = Gravity.CENTER;
            linLayoutParam.setMargins(marginsLeft,0,0,0);
            LLayout.layoutParams = linLayoutParam
            LL_Test.addView(LLayout)
        }
    }
}
