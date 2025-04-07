package com.example.apppractica1.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.apppractica1.data.db.model.AutoEntity
import com.example.apppractica1.databinding.ActivityMainBinding
import com.example.apppractica1.databinding.AutoElementBinding

class AutoViewHolder(
    private val binding: AutoElementBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(auto: AutoEntity) {
        binding.apply {
            tvTitle.text = auto.brand
            tvGenre.text = auto.model
            tvDeveloper.text = auto.color
//            tvTitle.text = auto.year
        }
    }

}