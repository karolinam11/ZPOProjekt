package com.example.maligiganci

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Quiz : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_main)
    val button = findViewById<View>(R.id.button_play)
    button.setOnClickListener {
        val intent = Intent(this@Quiz, QuizActivity::class.java)
        startActivity(intent) }
    }
}