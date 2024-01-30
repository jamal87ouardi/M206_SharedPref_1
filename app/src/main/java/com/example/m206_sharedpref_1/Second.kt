package com.example.m206_sharedpref_1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val sharedPreferences = getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE)

        val selVille = sharedPreferences.getInt("sel_ville", 0)


        val sp_villes = findViewById<Spinner>(R.id.spinner)



        val villes = mutableListOf<String>("Casa","Fes","Bejaad","Tanger","Merrakech")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, villes)

        sp_villes.adapter = adapter

        sp_villes.setSelection(selVille)

        sp_villes.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val editor = sharedPreferences.edit()
                editor.putInt("sel_ville", position)
                editor.apply()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }



    }
}