
package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val from = findViewById<EditText>(R.id.from)
        val to = findViewById<EditText>(R.id.to)
        val button = findViewById<Button>(R.id.less)
        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("from", from.text.toString().toInt())
            intent.putExtra("to", to.text.toString().toInt() )
            startActivity(intent)
        }
    }
}