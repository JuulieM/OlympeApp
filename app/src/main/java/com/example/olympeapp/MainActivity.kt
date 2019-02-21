package com.example.olympeapp

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvDate: TextView = findViewById(R.id.tv_date)
        tvDate.text = getCurrentDate()
    }

    /**
     * Return the current date in local format
     *
     * @author Yann GODEAU
     * @return Current date in local format
     */
    fun getCurrentDate(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val current = LocalDateTime.now()
            val formatter = SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE)
            var answer: String = formatter.format(current)
            answer
        } else {
            var date = Date();
            val formatter = SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE)
            val answer: String = formatter.format(date)
            answer
        }
    }

}
