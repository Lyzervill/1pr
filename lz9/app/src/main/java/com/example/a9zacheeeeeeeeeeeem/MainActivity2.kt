package com.example.a9zacheeeeeeeeeeeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ugadaiText: TextView = findViewById(R.id.ugadaiText)
        val userText: EditText = findViewById(R.id.userText)
        val appliBtn : Button = findViewById(R.id.appliBtn)


        appliBtn.setOnClickListener{
            val random: Int = Random.nextInt(0, 10)

          
            if(random == userText.text.toString().toInt()){
                ugadaiText.text = "Бот победил и угадал вашу цифру: ${userText.text}"

            }
            else{
                ugadaiText.text = "Бот проиграл вот его число ${random}"

            }

        }

    }
}