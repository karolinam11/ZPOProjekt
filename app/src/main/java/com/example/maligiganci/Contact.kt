package com.example.maligiganci

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth

class Contact : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        auth = FirebaseAuth.getInstance()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_kontakty)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val user = auth.currentUser

        val listaKontaktow = listOf(
            ContactClass("Email rodzica: email@gmail.com",
                "Email dziecka: " + (user?.email ?: "brak@email.com")
            )
        )

        recyclerView.adapter = ContactAdapter(listaKontaktow)
    }
}