package com.example.listviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var ListView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ListView = findViewById(R.id.ListView)

        val players = arrayOf(
            "Mushfiqur rahim",
            "Tamim Iqbal",
            "Sakib Al hasan",
            "Mashrafi",
            "Mushfiqur rahim",
            "Tamim Iqbal",
            "Sakib Al hasan",
            "Mashrafi",
            "Liton das",
            "Mahmudullah",
            "Taskin",
            "Mushfiqur rahim",
            "Tamim Iqbal",
            "Sakib Al hasan",
            "Mashrafi",
            "Mushfiqur rahim",
            "Tamim Iqbal",
            "Sakib Al hasan",
            "Mashrafi",
            "Liton das",
            "Mahmudullah",
            "Taskin"
        )
        val playerAdapter = ArrayAdapter<Any>(this@MainActivity,android.R.layout.simple_list_item_1, players)
        ListView.adapter = playerAdapter
        ListView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this@MainActivity,""+parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show()
        }

    }


}