package me.dibe.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactExampleList = generateDummyList(500)

        recycler_view.adapter = ContactAdapter(contactExampleList)
        recycler_view.layoutManager = LinearLayoutManager(this) // layoutManager is responsible to positioning the items in the recyclerView
        recycler_view.setHasFixedSize(true) // This is a performance optimization
        setListeners()
    }

    private fun setListeners()
    {
        btn_search?.setOnClickListener {
            Log.e("SEARCH CLICKED", "Button search was clicked!!!")
        }
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
            val item = Contact(drawable, i,"FName $i", " LName",i+1, "0000000000")
            list += item
        }
        return list
    }

}