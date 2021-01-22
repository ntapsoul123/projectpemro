package com.telkom.tubesku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Discount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discount)
        var harga = findViewById<EditText>(R.id.txt_barang)
        var diskon = findViewById<EditText>(R.id.txt_discount)
        var total = findViewById<TextView>(R.id.txt_hasil)
        setTitle("Discount")
        val buttonhitungbarang = findViewById<Button>(R.id.btnhitung)
        buttonhitungbarang.setOnClickListener(View.OnClickListener {
            val nharga = harga.text.toString().toInt()
            val ndiskon = diskon.text.toString().toInt()
            val diskon = ndiskon * nharga
            val totaldiskon = diskon / 100
            val totalbayar = nharga - totaldiskon
            total.text = totalbayar.toString()
        })
    }
}
