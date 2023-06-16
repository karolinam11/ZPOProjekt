package com.example.maligiganci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.imageButton1)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, Memory::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<View>(R.id.imageButton2)
        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, TicTacToe::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<View>(R.id.imageButton3)
        button3.setOnClickListener {
            val intent = Intent(this@MainActivity, Quiz::class.java)
            startActivity(intent)
        }
    }
}