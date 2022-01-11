package com.android.fairlyandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_spinner_test.*

class spinnerTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_test)

//        Spinner spinner;

        // Initializing a String Array
        val dayName = arrayOf("1","2","3","4","5","6","7",'8','9',"10","11","12","13","14","15","16","17",
            "18","19","20","21","22","23","24","25","26","27","28","29","30","31")

        val monthName = arrayOf("January","February","March","April","May",
            "June","July","August","September","October","November","December")

        val yearName = arrayOf("2021","2020","2019","2018","2017"
            ,"2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"
            ,"1999","1998","1997","1996","1995","1994","1993","1992" +
                    "1991","1990","1989","1988","1987","1986","1985",
            "1984","1983","1982","1981","1980","1979","1978","1977",
            "1976","1975","1974","1973","1972","1971","1970")

        // Initializing an ArrayAdapter
        val adapter = ArrayAdapter(
            this, // Context
            android.R.layout.simple_spinner_item, // Layout
            monthName // Array
        )

        // Set the drop down view resource
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        // Finally, data bind the spinner object with dapter
        tvMonth.adapter = adapter;
        // Set an on item selected listener for spinner object
        tvMonth.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long){
                // Display the selected item text on text view
                text_view.text = "Spinner selected : ${parent.getItemAtPosition(position).toString()}"
            }

            override fun onNothingSelected(parent: AdapterView<*>){
                // Another interface callback
            }
        }
    }
}