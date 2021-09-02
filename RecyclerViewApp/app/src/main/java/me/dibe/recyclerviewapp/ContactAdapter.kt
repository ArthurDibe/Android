package me.dibe.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contactList: List<Contact>) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){

    // This method is called by the RecyclerView when it is time to create a new ViewHolder on screen
    //      parent parameter -> needed to access RecyclerView and Activity layout
    //      viewType parameter -> only needed when we need to use different types of row layout in the same RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.single_contact, parent, false) // context -> is the Activity

        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contactImage: ImageView = itemView.findViewById(R.id.contact_image) // itemView.contact_image
        val contactName: TextView = itemView.findViewById(R.id.contact_name)    // itemView.contact_name
        val contactPhone: TextView = itemView.findViewById(R.id.contact_phone)  // itemView.contact_phone
    }
}