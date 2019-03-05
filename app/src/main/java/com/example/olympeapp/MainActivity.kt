package com.example.olympeapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.olympeapp.ui.Subheader
import kotlinx.android.synthetic.main.subheader.view.*
import java.text.SimpleDateFormat
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
        val date = Date()
        val formatter = SimpleDateFormat("EEEE dd MMMM", Locale.FRANCE)
        return formatter.format(date)
    }

}
