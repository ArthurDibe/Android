package me.dibe.debuggingtest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lblDebug = lblDebug
        val btnClick = btnClicked
        val btnUnclick = btnUnclicked
        var count: Int = 0

        btnClick.setOnClickListener {
            lblDebug.setTextColor(Color.GREEN)
            lblDebug.setText((++count).toString())
        }

        btnUnclick.setOnClickListener {
            lblDebug.setTextColor(Color.RED)
            lblDebug.setText((--count).toString())
        }
    }
}