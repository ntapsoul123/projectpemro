package com.telkom.tubesku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Home")

        val buttonDiscountActivity = findViewById<Button>(R.id.bt_discount)
        buttonDiscountActivity.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Discount::class.java)
            startActivity(intent)
        })
        val buttonCaloriesActivity = findViewById<Button>(R.id.bt_calories)
        buttonCaloriesActivity.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Calories::class.java)
            startActivity(intent)
    })
    }
}