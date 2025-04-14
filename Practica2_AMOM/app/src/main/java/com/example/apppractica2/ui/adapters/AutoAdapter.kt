package com.example.apppractica2.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apppractica2.data.remote.model.AutoDto
import com.example.apppractica2.databinding.AutoElementBinding

class AutoAdapter(
    private val autos: List<AutoDto>, // Los juegos a desplegar
    private val onAutoClick: (AutoDto) -> Unit // Para los clicks
): RecyclerView.Adapter<AutoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AutoViewHolder {
        val binding = AutoElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AutoViewHolder(binding)
    }

    override fun getItemCount(): Int = autos.size

    override fun onBindViewHolder(holder: AutoViewHolder, position: Int) {
        val auto = autos[position]

        holder.bind(auto)

        // Para el click
        holder.itemView.setOnClickListener {
            onAutoClick(auto)
        }
    }

}