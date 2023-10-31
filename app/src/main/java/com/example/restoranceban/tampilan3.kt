package com.example.restoranceban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class tampilan3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan3)

        val cursortouch: LinearLayout = findViewById(R.id.Buatke3)

        cursortouch.setOnClickListener {
            val intent = Intent(this, tampilan4::class.java)
            intent.putExtra("namaCustomer", "Contoh")
            startActivity(intent)
        }
    }
}
