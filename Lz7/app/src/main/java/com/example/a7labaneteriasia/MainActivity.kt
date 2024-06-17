package com.example.a7labaneteriasia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helBtn :Button = findViewById(R.id.helloBtn)
        val nextBtn:Button =  findViewById(R.id.nextBtn)
        var helText:TextView = findViewById(R.id.helloText)

        helBtn.setOnClickListener{
            helText.text = "Дарова"
        }
        var count  = 0
        val countBtn :Button = findViewById(R.id.countBtn)
        countBtn.setOnClickListener{
            countBtn.text = "Я нажал на эту кнопку ${++ count} раз"
        }
        nextBtn.setOnClickListener{
            val  intent = Intent(this,MainActivity2::class.java)

            startActivity(intent)
        }
    }
}