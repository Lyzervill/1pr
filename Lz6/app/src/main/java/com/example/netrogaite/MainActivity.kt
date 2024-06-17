package com.example.netrogaite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oneBtn: Button = findViewById(R.id.oneBtn)
        val twoBtn: Button = findViewById(R.id.twoBtn)
        val treeBtn: Button = findViewById(R.id.treeBtn)
        val forBtn: Button = findViewById(R.id.forBtn)

        val text : TextView = findViewById(R.id.questText)
var  bo = false
        var f = true
        var twob = false
        var treeb = false
        oneBtn.setOnClickListener{
            if(f) {

                oneBtn.text = "Не правильный ответ"
                bo = true
                twoBtn.text = "Правильный ответ"
                text.text = "Вопрос2"
                twob = true
            }
            else{text.text = "Не повезло"}
           f = false


        }

        twoBtn.setOnClickListener{
            if(treeb){
                text.text = "Не повезло"

            }
            else if(twob) {
                text.text = "Вопрос3"
           treeb = true
                twoBtn.text = "Неправильный ответ"
                treeBtn.text = "Правильный ответ"
            }

            else{
                text.text = "Неправильно"
            }
        }
        treeBtn.setOnClickListener{
            if(treeb){
                text.text = "МОЛОДЕЦ ТЫ МИЛЛИАРДЕР"

            }
            else{
                text.text = "Неправильно"

            }
        }
        forBtn.setOnClickListener{
            text.text = "Неправильно"

        }

    }
}