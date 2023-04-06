package com.kazanov.kazanovmonththreelessonseven.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kazanov.kazanovmonththreelessonseven.Drinks
import com.kazanov.kazanovmonththreelessonseven.databinding.ItemDrinksBinding

class DrinksAdapter (var arrayListDrinks : ArrayList<Drinks>):
    RecyclerView.Adapter<DrinksAdapter.DrinksViewsHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : DrinksViewsHolder {
        return DrinksViewsHolder(ItemDrinksBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: DrinksAdapter.DrinksViewsHolder, position: Int)
    {
        holder.onBind(arrayListDrinks[position])

    }

    override fun getItemCount(): Int {
        return arrayListDrinks.size
    }

        class DrinksViewsHolder(private val binding: ItemDrinksBinding)
        : RecyclerView.ViewHolder(binding.root) {

            fun onBind(drinks: Drinks){
                binding.tvName.text = drinks.Name
                binding.tvPrice.text = drinks.Price.toString()
            }
    }
}