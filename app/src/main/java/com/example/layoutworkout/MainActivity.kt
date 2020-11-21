package com.example.layoutworkout


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

abstract class MainActivity(private var numbersAdapter: NumbersAdapter, private var numbersList: RecyclerView) : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numbersList = findViewById(R.id.rv_numbers)

        var layoutManager: LinearLayoutManager = LinearLayoutManager(this)
        numbersList.layoutManager = layoutManager

        numbersList.setHasFixedSize(true)

        numbersAdapter = NumbersAdapter(100)
        numbersList.adapter = numbersAdapter

    }
}
