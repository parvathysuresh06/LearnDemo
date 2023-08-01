package com.example.learndemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_one)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val itemList = listOf("ONE", "TWO", "THREE") // Replace with your data
        val adapter = CardAdapter(itemList)
        recyclerView.adapter =adapter

        val name=intent.getStringExtra("NAME")
        val displayName=findViewById<TextView>(R.id.user_display)
        displayName.text=name
    }


}
