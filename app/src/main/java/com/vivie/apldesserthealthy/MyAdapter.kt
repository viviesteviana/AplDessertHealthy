package com.vivie.apldesserthealthy

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MyAdapter (private val listData: ArrayList<ModelDessert>) :
    RecyclerView.Adapter<MyAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val dessert = listData[position]

        Glide.with(holder.itemView.context)
            .load(dessert.img)
            .apply(RequestOptions().override(55, 55))
            .into((holder.tvImg))

        holder.tvTitle.text = dessert.title
        holder.tvDesc.text = dessert.desc

        val moveDetail = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveToDetail = Intent(moveDetail, DetailActivity::class.java)

            moveToDetail.putExtra(DetailActivity.TITLE, dessert.title)
            moveToDetail.putExtra(DetailActivity.DESC, dessert.desc)
            moveToDetail.putExtra(DetailActivity.DESC, dessert.desc)
            moveToDetail.putExtra(DetailActivity.PEMBUATAN, dessert.pembuatan)
            moveDetail.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.item_title)
        var tvDesc: TextView = itemView.findViewById(R.id.item_desc)
        var tvImg: ImageView = itemView.findViewById(R.id.item_img)

    }
}