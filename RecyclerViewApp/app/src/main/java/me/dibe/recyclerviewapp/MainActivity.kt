package me.dibe.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // This function generates dummy data, the user needs to pass the number of rows to be generated
    private fun generateDummyList(size: Int): List<Contact> {
        val list = ArrayList<Contact>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_meditate
                else -> R.drawable.ic_smile
            }
            val item = Contact(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }

}