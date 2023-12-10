package com.example.maligiganci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val kontakty: List<ContactClass>) : RecyclerView.Adapter<ContactAdapter.KontaktViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KontaktViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_kontakt, parent, false)
        return KontaktViewHolder(view)
    }

    override fun onBindViewHolder(holder: KontaktViewHolder, position: Int) {
        val kontakt = kontakty[position]
        holder.email.text = kontakt.email
        holder.email2.text = kontakt.email2

    }

    override fun getItemCount() = kontakty.size
    class KontaktViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val email: TextView = view.findViewById(R.id.nazwa_kontaktu)
        val email2: TextView = view.findViewById(R.id.email_kontaktu)
    }
}
