package com.example.lab1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val less = findViewById<Button>(R.id.less)
        val more = findViewById<Button>(R.id.more)
        val num = findViewById<TextView>(R.id.num)
        val arguments = intent.extras

        var from = arguments?.getInt("from") as Int
        var to = arguments?.get("to") as Int
        var number = guess(from,to)
        num.text = number.toString()

        less.setOnClickListener{
            to = number
            number = guess(from, to)
            num.text = number.toString()
            Log.i("INFO", "[$from , $to]")
        }

        more.setOnClickListener{
            from = number
            number = guess(from, to)
            num.text = number.toString()
            Log.i("INFO", "[$from , $to]")
        }
    }

    fun guess(from: Int, to: Int ): Int {
        return Random.nextInt(from+1, to)
    }


}