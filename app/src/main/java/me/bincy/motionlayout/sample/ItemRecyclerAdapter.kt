package me.bincy.motionlayout.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.bincy.motionlayout.sample.databinding.ItemRecyclerViewBinding

class ItemRecyclerAdapter : RecyclerView.Adapter<ItemRecyclerAdapter.ViewHolder>() {

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    inner class ViewHolder(private val binding: ItemRecyclerViewBinding) : RecyclerView.ViewHolder(binding.root)
}