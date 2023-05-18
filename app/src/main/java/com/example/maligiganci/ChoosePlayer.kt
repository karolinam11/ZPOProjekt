package com.example.maligiganci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChoosePlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_player)

        val button = findViewById<View>(R.id.button_easy_level)
        button.setOnClickListener {
            val intent = Intent(this, GameTicTacToeEasy::class.java)
            startActivity(intent)
        }
    }
}