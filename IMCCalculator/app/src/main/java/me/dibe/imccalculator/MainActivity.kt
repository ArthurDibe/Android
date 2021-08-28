package me.dibe.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LIFE CYCLE", "CREATE - Screen is being created!!!")
    }

    override fun onStart(){
        super.onStart()
        Log.w("LIFE CYCLE", "START - Screen is being started with the components!!!")
    }
}