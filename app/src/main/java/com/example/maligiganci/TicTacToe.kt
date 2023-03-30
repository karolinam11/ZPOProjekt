package com.example.maligiganci


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class TicTacToe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)

        val button = findViewById<View>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@TicTacToe, ChooseMode::class.java)
            startActivity(intent) }
    }
}