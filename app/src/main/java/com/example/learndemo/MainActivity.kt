package com.example.learndemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val nameEditText=findViewById<EditText>(R.id.user_name)
        val logBtn = findViewById<Button>(R.id.log_button)
        logBtn.setOnClickListener {
            val name = nameEditText.text.toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}
