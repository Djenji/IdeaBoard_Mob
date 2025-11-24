package com.example.ideaboard_mob

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val btnEntry = findViewById<Button>(R.id.btnEntry)
        val btnLine = findViewById<Button>(R.id.btnLine)

        // Переход на регистрацию
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Переход на вход
        btnEntry.setOnClickListener {
            val intent = Intent(this, EntryActivity::class.java)
            startActivity(intent)
        }

        // Переход на ленту
        btnLine.setOnClickListener {
            val intent = Intent(this, LineActivity::class.java)
            startActivity(intent)
        }
    }
}