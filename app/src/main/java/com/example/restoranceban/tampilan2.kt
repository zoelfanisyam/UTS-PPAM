package com.example.restoranceban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class tampilan2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampilan2)

        val buttonMenus: Button = findViewById(R.id.submitButton)

        buttonMenus.setOnClickListener {
            val intent = Intent(this, tampilan3::class.java)
            intent.putExtra("namaCustomer", "Contoh")
            startActivity(intent)
        }

    }
}