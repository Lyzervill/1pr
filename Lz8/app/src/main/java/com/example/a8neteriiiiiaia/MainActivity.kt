package com.example.a8neteriiiiiaia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redBtn: Button = findViewById(R.id.redBtn)
        val yellBtn :Button = findViewById(R.id.yellowBtn)
        val greenBtn: Button = findViewById(R.id.greenBtn)
        val rLayout: ConstraintLayout = findViewById(R.id.rla)
        val nextBtn :Button = findViewById(R.id.nextBtn)
        redBtn.setOnClickListener{
            rLayout.setBackgroundColor(resources.getColor(R.color.red))
        }
        yellBtn.setOnClickListener{
            rLayout.setBackgroundColor(resources.getColor(R.color.yellow))
        }
        greenBtn.setOnClickListener{
            rLayout.setBackgroundColor(resources.getColor(R.color.green))
        }
        nextBtn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}