package com.example.myapplication

import android.graphics.Color
import android.icu.util.UniversalTimeScale.toBigDecimal
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*  // activity_main.xml is imported and seen
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = calcular
        val lblResult = resultados

        btnCalculate.setOnClickListener {
            val lgrade1:BigDecimal = grade1.text.toString()?.toBigDecimal() ?: BigDecimal.ZERO
            val lgrade2:BigDecimal = grade2.text.toString()?.toBigDecimal() ?: BigDecimal.ZERO
            val average:BigDecimal = (lgrade1 + lgrade2)/2.toBigDecimal()
            val lmissing = Integer.parseInt(missingClasses.text?.toString()) ?: 0

            if(average >= 6.toBigDecimal() && lmissing <= 10 )
            {
                lblResult.setText("Student APPROUVED!\nStudent's average: ${average}\n Number of Missing Classes: ${lmissing}")
                lblResult.setTextColor(Color.GREEN)
            }
            else
            {
                lblResult.setText("Student FAILED!\nStudent's average: ${average}\n Number of Missing Classes: ${lmissing}")
                lblResult.setTextColor(Color.RED)
            }

        }
    }
}