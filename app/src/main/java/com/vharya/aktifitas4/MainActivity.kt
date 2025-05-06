package com.vharya.aktifitas4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonMenu1: Button = findViewById(R.id.button_menu1)
        val buttonMenu2: Button = findViewById(R.id.button_menu2)

        buttonMenu1.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu1Activity::class.java)
            startActivity(intent)
        }

        buttonMenu2.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu2Activity::class.java)
            startActivity(intent)
        }
    }
}