package me.dibe.recyclerviewapp

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class HelperDB (
    context: Context?
) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        private val DB_NAME = "contatos.db"
        private val DB_VERSION = 4 // should change when there is a change in the database structure
    }

    val TABLE_NAME = "contatos"
    val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
    val COLUMN_ID = "id"
    val COLUMN_IMAGE = "image"
    val COLUMN_FNAME = "firstName"
    val COLUMN_LNAME = "lastName"
    val COLUMN_AGE = "age"
    val COLUMN_PHONE = "phoneNumber"

    val CREATE_TABLE =
        "CREATE TABLE $TABLE_NAME (" +
            "$COLUMN_ID INTEGER NOT NULL," +
            "$COLUMN_IMAGE INTEGER NOT NULL," +
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

    fun findAll():List<Contact>{
        val db:SQLiteDatabase = readableDatabase ?: return mutableListOf()
        var contactList:MutableList<Contact> = mutableListOf<Contact>()

        val sql = "SELECT * FROM $TABLE_NAME"

        var cursor:Cursor = db.rawQuery(sql,arrayOf()) ?: return mutableListOf()
        if(cursor == null)
        {
            db.close()
            return mutableListOf()
        }
        while(cursor.moveToNext()){
            var index = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
            var contact = Contact(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                index,
                cursor.getString(cursor.getColumnIndex(COLUMN_FNAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LNAME)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_AGE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_PHONE))
            )
            contactList.add(contact)
        }
        db.close()
        return contactList
    }

    fun findContacts(find: String):List<Contact>{
        val db:SQLiteDatabase = readableDatabase ?: return mutableListOf()
        var contactList:MutableList<Contact> = mutableListOf<Contact>()

        val sql = "SELECT * FROM $TABLE_NAME"

        var cursor:Cursor = db.rawQuery(sql,arrayOf()) ?: return mutableListOf()
        if(cursor == null)
        {
            db.close()
            return mutableListOf()
        }
        while(cursor.moveToNext()){
            var index = cursor.getInt(cursor.getColumnIndex(COLUMN_ID))
            var contact = Contact(
                cursor.getInt(cursor.getColumnIndex(COLUMN_ID)),
                index,
                cursor.getString(cursor.getColumnIndex(COLUMN_FNAME)),
                cursor.getString(cursor.getColumnIndex(COLUMN_LNAME)),
                cursor.getInt(cursor.getColumnIndex(COLUMN_AGE)),
                cursor.getString(cursor.getColumnIndex(COLUMN_PHONE))
            )
            contactList.add(contact)
        }
        db.close()
        return contactList
    }

    fun insertContact(contact: Contact) {
        val db:SQLiteDatabase = writableDatabase ?: return
        val sql = "INSERT INTO $TABLE_NAME ($COLUMN_IMAGE, $COLUMN_FNAME, $COLUMN_LNAME, $COLUMN_AGE, $COLUMN_PHONE) " +
                "VALUES ( ${contact.imageResource}, '${contact.fname}' , '${contact.lname}', ${contact.age}, '${contact.phone}')"

        db.execSQL(sql)
        db.close()
    }

}