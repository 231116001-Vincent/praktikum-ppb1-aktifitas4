package com.vharya.aktifitas4

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonRegister: Button = findViewById(R.id.button_register)
        val buttonBack: Button = findViewById(R.id.button_back)

        buttonRegister.setOnClickListener {
            Toast.makeText(this, "Latihan intent menu 1", Toast.LENGTH_SHORT).show()
        }

        /*
         * Tidak menggunakan startActivity()
         * Semua activity ditumpuk seperti tumpukan kertas dimana kertas (Activity) teratas akan terlihat pada layar
         * Jadi tidak perlu menggunakan startActivity() hanya finish() untuk mengeluarkan Activity dari tumpukan (Stack)
         *
         * OFFICIAL ANDROID DOCUMENTATION:
         * https://developer.android.com/guide/components/activities/tasks-and-back-stack
         */
        buttonBack.setOnClickListener { finish() }
    }
}