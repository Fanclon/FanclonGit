package com.example.bank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btnID = intent.getStringExtra("Button").toString()
        textView.text = btnID
        var lvDRW: Int;
        if (btnID == "1") {
            lvDRW= R.mipmap.ic_launcher;
        }
        else
        {
            lvDRW= R.mipmap.ic_launcher_round
        }
        imageView.setImageResource(lvDRW)
    }
}
