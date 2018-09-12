package com.team.halae

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SearchAdapter(var searchResult : ArrayList<SearchItem>) : RecyclerView.Adapter<SearchViewHolder>() {

    private var itemClick : ItemClick? = null
    public interface ItemClick{
        public fun onClick(view : View, position: Int)
    }

    public fun setItemClick(itemClick : ItemClick) {
        this.itemClick = itemClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val mainView : View = LayoutInflater.from(parent.context).inflate(R.layout.halmate_search_item, parent, false)
        return SearchViewHolder(mainView)
    }

    override fun getItemCount(): Int = searchResult.size

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.halmateImg.setImageResource(searchResult[position].image)
        holder.halmateName.setText(searchResult[position].name)
        holder.halmateAge.setText(searchResult[position].age.toString())
        holder.halmateAddress.setText(searchResult[position].address)
        holder.hamateInterest.setText(searchResult[position].interest)




    }

}