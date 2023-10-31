package com.example.restoranceban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class tampilan4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan4)

        val orderklik: Button = findViewById(R.id.ordercok)

        orderklik.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        val backto3: Button = findViewById(R.id.BACKBACK)

        backto3.setOnClickListener {
            val intent = Intent(this, tampilan3::class.java)
            startActivity(intent)
        }

    }
}