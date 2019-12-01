package com.dvtri.leo_cosmetic_2710.fragment

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dvtri.leo_cosmetic_2710.data.Order
import com.dvtri.leo_cosmetic_2710.fragment.OrderAdapter.MyViewHolder as MyViewHolder

class OrderAdapter(listOrders: ArrayList<Order>) : RecyclerView.Adapter<MyViewHolder>() {

    var listOrders : ArrayList<Order> = ArrayList()

    init {
        this.listOrders = listOrders
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return listOrders.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}