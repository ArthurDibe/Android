package me.dibe.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    var helperDB: HelperDB? = HelperDB(this)
    var contactsList: List<Contact> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val contactExampleList = generateDummyList(500)

        var helperDB: HelperDB? = HelperDB(this)
        val context = this
        testResult.text = ""

        try {
            contactsList = helperDB?.findAll() ?: mutableListOf()

        }catch(e:Exception){
            e.printStackTrace()
        }
        for (contact in contactsList) {
            testResult.append("${contact.fname} ${contact.lname} is ${contact.age} years old with a phone ${contact.phone}\n")
        }

//        recycler_view.adapter = ContactAdapter(contactsList)
//        recycler_view.layoutManager = LinearLayoutManager(context) // layoutManager is responsible to positioning the items in the recyclerView
//        recycler_view.setHasFixedSize(true) // This is a performance optimization

        setListeners()
    }

    private fun setListeners()
    {
        btn_search?.setOnClickListener {
            val inputName = input_personName
            val typedName:String = inputName.text.toString()
            var contactsList: List<Contact> = mutableListOf()


            // Database calls MUST be inside try catch
            try {
//                contactsList = ContactsApplication.instance.helperDB?.findContacts(typedName) ?: mutableListOf()
                contactsList = helperDB?.findContacts(typedName) ?: mutableListOf()

//                recycler_view.adapter = ContactAdapter(contactsList)
//                recycler_view.layoutManager = LinearLayoutManager(this) // layoutManager is responsible to positioning the items in the recyclerView
//                recycler_view.setHasFixedSize(true) // This is a performance optimization

            }catch(e:Exception){
                e.printStackTrace()
            }

            Log.i("Contacts Found", contactsList.toString())
        }

        btn_insert?.setOnClickListener {
            val inputFName = input_personName.text?.toString() ?: ""
            val inputLName = input_personLastName.text?.toString() ?: ""
            val inputAge = input_personAge.text?.toString() ?: "0"
            val inputPhone = input_personPhone.text?.toString() ?: ""

            try{
                helperDB?.insertContact( Contact( chooseRandomImage(contactsList.size),contactsList.size+1, inputFName, inputLName, inputAge.toInt(), inputPhone) )
                contactsList = helperDB?.findAll() ?: mutableListOf()
            }catch (e: Exception){
                e.printStackTrace()
            }

            val last = contactsList.size - 1
            testResult.append("${contactsList[last].fname} ${contactsList[last].lname} is ${contactsList[last].age} years old with a phone ${contactsList[last].phone}\n")

            Log.i("INSERTED", contactsList[last].toString())
        }

    }

    private fun chooseRandomImage(index: Int): Int{
        val drawable = when (index % 3) {
            0 -> R.drawable.ic_android
            1 -> R.drawable.ic_meditate
            else -> R.drawable.ic_smile
        }
        return drawable
    }

//    // This function generates dummy data, the user needs to pass the number of rows to be generated
//    private fun generateDummyList(size: Int): List<Contact> {
//        val list = ArrayList<Contact>()
//        for (i in 0 until size) {
//            val drawable = when (i % 3) {
//                0 -> R.drawable.ic_android
//                1 -> R.drawable.ic_meditate
//                else -> R.drawable.ic_smile
//            }
//            val item = Contact(drawable, i,"FName $i", " LName",i+1, "0000000000")
//            list += item
//        }
//        return list
//    }

}