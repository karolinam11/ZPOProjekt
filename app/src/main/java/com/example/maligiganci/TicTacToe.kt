package com.example.maligiganci


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class TicTacToe : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)

        val button = findViewById<View>(R.id.button_play)
        button.setOnClickListener {
            val intent = Intent(this@TicTacToe, ChooseMode::class.java)
            startActivity(intent) }
    }
}