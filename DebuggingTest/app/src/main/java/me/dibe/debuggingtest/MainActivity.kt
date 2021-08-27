package me.dibe.debuggingtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lblDebug = lblDebug
        val inputName = inputYourName
        val inputAge = inputAge
        val btnClick = btnClicked
        val btnUnclick = btnUnclicked
        val btnSendText = btnSendText
        val btnSendAge = btnSendAge
        var count: Int = 0

        btnClick.setOnClickListener {
            lblDebug.setTextColor(Color.GREEN)
            lblDebug.setText((++count).toString())
            Log.d("count", "OPA! The add button was clicked!")
        }

        btnUnclick.setOnClickListener {
            lblDebug.setTextColor(Color.RED)
            lblDebug.setText((--count).toString())
            Log.e("unCLick", "OOOPA!!! You clicked on Unclick Button!!!!!")
        }

        btnSendText.setOnClickListener {

            lblDebug.setTextColor(Color.MAGENTA)
            if(inputName.text.toString().isEmpty())
            {
                lblDebug.setText("WHO ARE YOU?")
            }
            else {
                lblDebug.setText(inputName.text.toString())
            }

        }

        btnSendAge.setOnClickListener {
            lblDebug.setTextColor(Color.BLUE)

            try {
                val age:Int = inputAge.text.toString().toInt()
            }
            catch(e: NumberFormatException) {
                Log.e("Input Text", e.cause.toString() + " -> Missing to enter a number!!!")
                lblDebug.setText("WHAT NUMBER?")
            }
        }

    }
}