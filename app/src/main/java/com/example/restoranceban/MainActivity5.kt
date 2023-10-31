package com.example.restoranceban

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val doneee: Button = findViewById(R.id.DONECOK)

        doneee.setOnClickListener {
            val siGone: TextView = findViewById(R.id.sigone)

            siGone.visibility = View.VISIBLE
        }
    }
}