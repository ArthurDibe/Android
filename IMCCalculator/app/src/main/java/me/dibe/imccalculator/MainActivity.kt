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

    override fun onResume(){
        super.onResume()
        Log.w("LIFE CYCLE", "RESUME - Screen is being resumed and ready to be interactive! =D")
    }

    override fun onPause(){
        super.onPause()
        Log.w("LIFE CYCLE", "PAUSE - Screen is being minimized... ")
    }

    override fun onRestart(){
        super.onRestart()
        Log.w("LIFE CYCLE", "RESTART - App is being Restarted !!!")
    }
}