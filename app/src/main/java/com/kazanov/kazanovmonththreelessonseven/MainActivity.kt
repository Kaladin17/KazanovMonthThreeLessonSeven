package com.kazanov.kazanovmonththreelessonseven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kazanov.kazanovmonththreelessonseven.adapter.DrinksAdapter
import com.kazanov.kazanovmonththreelessonseven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: DrinksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillRecyclerView()
    }

    private fun fillRecyclerView() {


        val arrayList: ArrayList<Drinks> = ArrayList()
        arrayList.add(Drinks("Coca cola", 60))
        arrayList.add(Drinks("Mojito", 50))
        arrayList.add(Drinks("Lemonade", 40))
        arrayList.add(Drinks("Airan", 60))
        adapter = DrinksAdapter(arrayList)
        binding.recyclerView.adapter = adapter
    }
}