package com.example.clone_ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clone_ui.databinding.LayoutItemBinding

class ProductAdapter (val productItem: MutableList<ProductItem>) : RecyclerView.Adapter<ProductAdapter.Holder>() {


    inner class Holder(val binding : LayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val ivProduct = binding.ivProduct
        val tvPrice = binding.tvPrice
        val tvTime = binding.tvTime
        val tvTitle = binding.tvTitle
        val tvLoca = binding.tvLoca
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  Holder(binding)
    }

    override fun getItemCount(): Int = productItem.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.ivProduct.setImageResource(productItem[position].ivProduct)
        holder.tvPrice.text = productItem[position].tvPrice
        holder.tvTime.text = productItem[position].tvTime
        holder.tvTitle.text = productItem[position].tvTitle
        holder.tvLoca.text = productItem[position].tvLoca
    }
}