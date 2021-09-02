package me.dibe.recyclerviewapp

import android.app.Application

class ContactsApplication : Application() {

    var helperDB: HelperDB? = null ; private set

    override fun onCreate() {
        super.onCreate()
        helperDB = HelperDB(this)
    }
}