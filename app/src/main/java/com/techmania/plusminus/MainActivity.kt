package com.techmania.plusminus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var addition : Button
    lateinit var subtraction : Button
    lateinit var multiplication : Button
    lateinit var division : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addition = findViewById(R.id.buttonAdd)
        subtraction = findViewById(R.id.buttonSub)
        multiplication = findViewById(R.id.buttonMul)
        division = findViewById(R.id.buttonDiv)

        addition.setOnClickListener {
            val intent = Intent(this@MainActivity,addActivity::class.java)
            startActivity(intent)
        }
        subtraction.setOnClickListener {
            val intent = Intent(this@MainActivity,subActivity::class.java)
            startActivity(intent)


        }
        multiplication.setOnClickListener {
            val intent = Intent(this@MainActivity,mulActivity::class.java)
            startActivity(intent)

        }
        division.setOnClickListener {
            val intent = Intent(this@MainActivity,divActivity::class.java)
            startActivity(intent)

        }
    }
}