package com.example.a7labaneteriasia

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val image:ImageView = findViewById(R.id.imageView)
        val countText: TextView = findViewById(R.id.countText)
        var count = 0
        var b = true
        var b1 = false
        var b2 = false
        var b3 = false
        var b4 = false
        var b5 = false
        var b6 = false
        image.setOnClickListener{
            countText.text = "Нажал на изображение ${++count}"

            if(b6){
                b = true
                image.setImageResource(R.drawable.ic_test7)
                b6 = false

            }
            if(b5){
                b6 = true
                image.setImageResource(R.drawable.ic_test6)
                b5 =false

            }
            if(b4){
                b5 = true
                image.setImageResource(R.drawable.ic_test5)
                b4 = false
            }
            if(b3){
                b4 = true
                image.setImageResource(R.drawable.ic_test4)
                b3 = false

            }
            if(b2){
                b3 = true
                image.setImageResource(R.drawable.ic_test3)
                b2 = false

            }
            if(b1){
            b2 = true
                image.setImageResource(R.drawable.ic_test)
                b1 = false

            }
            if(b){
                b1 = true
                image.setImageResource(R.drawable.ic_test2)
                b =false

            }


        }
    }
}