package com.example.maligiganci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Kalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

    val button = findViewById<View>(R.id.button)
    button.setOnClickListener {
        val intent = Intent(this@Kalkulator, ChooseMode::class.java)
        startActivity(intent) }
    }
}