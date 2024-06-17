package com.example.a8neteriiiiiaia

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val fontBtn:Button = findViewById(R.id.fontBtn)
        val seeText:TextView = findViewById(R.id.seeText)
        val fontText:TextView = findViewById(R.id.fontText)

        fontBtn.setOnClickListener{

            if(fontText.text == null) seeText.text = "пусто"
            seeText.textSize = fontText.text.toString().toFloat()


        }
    }
}