package com.example.p6recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.p6recyclerview.adapters.contactosAdapters

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
        val recyclerView : RecyclerView = findViewById(R.id.recycle_contacto)

        val contactos = arrayOf("Luis", "Juan", "Lola", "Pedro")

        val contactosAdapters = contactosAdapters(this, contactos)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contactosAdapters
    }
}