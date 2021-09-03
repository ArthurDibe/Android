package me.dibe.recyclerviewapp

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class HelperDB (
    context: Context?
) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        private val DB_NAME = "contato.db"
        private val DB_VERSION = 1 // should change when there is a change in the database structure
    }

    val TABLE_NAME = "contatos"
    val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
    val COLUMN_ID = "id"
    val COLUMN_FNAME = "firstName"
    val COLUMN_LNAME = "lastName"
    val COLUMN_AGE = "age"
    val COLUMN_PHONE = "phoneNumber"

    val CREATE_TABLE =
        "CREATE TABLE $TABLE_NAME (" +
            "$COLUMN_ID INTEGER NOT NULL," +
            "$COLUMN_FNAME TEXT NOT NULL," +
            "$COLUMN_LNAME TEXT NOT NULL," +
            "$COLUMN_AGE TEXT NOT NULL," +
            "$COLUMN_PHONE TEXT NOT NULL," +
            "PRIMARY KEY ($COLUMN_ID AUTOINCREMENT)" +
        ")"


    // onCreate is responsible for the creation of the Tables
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CREATE_TABLE)
    }

    // onUpgrade is responsible for comparing which version the database is and which
    // version was previously
    // always that there is a change in the database, like new table created, a new field on a table
    // so it is likely that if there is a change in the database structure, then
    // the DB_VERSION number MUST change!
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if(oldVersion != newVersion)
        {
            // update tables, create table, etc ...
            db?.execSQL(DROP_TABLE)
        }
        onCreate(db)
    }

    fun findContacts(find: String):List<Contact>{
        val db:SQLiteDatabase = readableDatabase ?: return mutableListOf()
        var contactList:MutableList<Contact> = mutableListOf<Contact>()

        val sql = "SELECT * FROM $TABLE_NAME"

        var cursor:Cursor = db.rawQuery(sql,null) ?: return mutableListOf()

        while(cursor.moveToNext()){
            var i = 0
            var contact = Contact(
                i++ % 3,
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                cursor.getString(cursor.getColumnIndex(COLUMN_FNAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LNAME)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_AGE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_PHONE))
            )
            contactList.add(contact)
        }

        return contactList
    }

}