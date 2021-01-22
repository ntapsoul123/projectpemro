package com.telkom.tubesku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calories)
        setTitle("Calories")
        var ages = findViewById<EditText>(R.id.txt_ages)
        var weight = findViewById<EditText>(R.id.txt_weight)
        var height = findViewById<EditText>(R.id.txt_height)
        var result = findViewById<TextView>(R.id.txt_result)
        var bmrValue:Double
        val button = findViewById<Button>(R.id.btn_hitung)
        button.setOnClickListener(View.OnClickListener {
            val nages = ages.text.toString().toDouble()
            val nweight = weight.text.toString().toDouble()
            val nheight = height.text.toString().toDouble()

            //hasil BMR
            bmrValue = (10*nweight)+(6.25 * nheight)-(5*nages)
            result.setText("$bmrValue Calories/day")
        })
        }


    }