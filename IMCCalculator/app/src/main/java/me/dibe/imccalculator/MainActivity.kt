package me.dibe.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LIFE CYCLE", "CREATE - Screen is being created (no components yet) !")
    }

    override fun onStart(){
        super.onStart()
        Log.w("LIFE CYCLE", "START - Screen is being started with the components and it is visible!!!")
    }

    override fun onResume(){
        super.onResume()
        Log.w("LIFE CYCLE", "RESUME - Screen is being resumed and ready to be interactive! =D")
    }

    override fun onPause(){
        super.onPause()
        Log.w("LIFE CYCLE", "PAUSE - Screen is being out of focus and you cannot interact with it... ")
    }

    override fun onStop(){
        super.onStop()
        Log.w("LIFE CYCLE", "STOP - Screen is not visible but it still exists, because it was left on background...")
    }

    override fun onRestart(){
        super.onRestart()
        Log.w("LIFE CYCLE", "RESTART - App is being Restarted !!!")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.w("LIFE CYCLE", "DESTROY - App is being shut down completely .... =(")
    }
}