package com.example.a9zacheeeeeeeeeeeem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomText : TextView = findViewById(R.id.randomText)

        val randomBtn:Button = findViewById(R.id.randomBtn)
        val nextBtn : Button = findViewById(R.id.nextBtn)

        randomBtn.setOnClickListener{
            val random : Int = Random.nextInt(0, 50000)
            val random2:Int = Random.nextInt(14,40)
            randomText.text = random.toString()
            randomText.textSize = random2.toFloat()


            }
        nextBtn.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}