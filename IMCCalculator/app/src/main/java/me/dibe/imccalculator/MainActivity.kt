package me.dibe.imccalculator

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    var height_:String = ""
    var weight_:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("LIFE CYCLE", "CREATE - Screen is being created (no components yet) !")
        setListeners()
    }

    private fun showDefaultDialog(result:String) {
        val alertDialog = AlertDialog.Builder(this)

        alertDialog.apply {
//            setIcon(R.drawable.ic_hello)
            setTitle("IMC Result")
            setMessage(result)
//            setPositiveButton("Positive") { _, _ ->
//                Toast.makeText(applicationContext, "Clicked Positive Button", Toast.LENGTH_SHORT).show()
//            }
//            setNegativeButton("Negative") { _, _ ->
//                Toast.makeText(applicationContext, "Clicked Negative Button", Toast.LENGTH_SHORT).show()
//            }
            setNeutralButton("THANKS") { _, _ ->
                Toast.makeText(applicationContext, "Amazing !", Toast.LENGTH_SHORT).show()
            }
        }.create().show()
    }

    private fun setListeners()
    {
        input_height?.doOnTextChanged { text, _, _, _ ->
            height_ = text.toString()
        }

        input_weight?.doOnTextChanged { text, _, _, _ ->
            weight_ = text.toString()
        }

        button?.setOnClickListener {
            calculateIMC(height_, weight_)
        }
    }

    private fun calculateIMC(pheight: String, pweight: String)
    {
        val lheight = pheight.toFloatOrNull()
        val lweight = pweight.toFloatOrNull()

        if(lweight == null) {
            Toast.makeText(applicationContext, "You must provide WEIGHT", Toast.LENGTH_SHORT).show()
        }
        else if(lheight == null) {
            Toast.makeText(applicationContext, "You must provide HEIGHT", Toast.LENGTH_SHORT).show()
        }
        else {
            var resultIMC = (lweight / (lheight * lheight))
            val message = "Your IMC ${String.format("%.2f", resultIMC)}"
//            result.text = message
//            result.visibility = View.VISIBLE
            showDefaultDialog(message)
        }
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