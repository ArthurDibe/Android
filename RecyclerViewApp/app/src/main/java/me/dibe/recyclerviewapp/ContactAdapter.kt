package me.dibe.recyclerviewapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage: ImageView = itemView.findViewById(R.id.contact_image) // itemView.contact_image
        val contactName: TextView = itemView.findViewById(R.id.contact_name)    // itemView.contact_name
        val contactPhone: TextView = itemView.findViewById(R.id.contact_phone)  // itemView.contact_phone
    }
}