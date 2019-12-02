package com.dvtri.leo_cosmetic_2710.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.marginBottom
import androidx.recyclerview.widget.RecyclerView
import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Order
import com.dvtri.leo_cosmetic_2710.fragment.OrderAdapter.MyViewHolder as MyViewHolder

class OrderAdapter(listOrders: ArrayList<Order>) : RecyclerView.Adapter<MyViewHolder>() {

    var listOrders : ArrayList<Order> = ArrayList()

    init {
        this.listOrders = listOrders
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_oders, parent, false))
    }

    override fun getItemCount(): Int {
        return listOrders.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = listOrders[position]
        holder.tvOrderName.text = item.orderID +"_"+item.customerName
        holder.tvAdress.text = item.shipAddress
        holder.tvNote.text = item.note
        when(item.status.toInt()){
            1 -> {
                holder.tvStatus.text = "Hoàn thành"
                holder.imgStatus.setImageResource(R.drawable.ic_sucess)
            }
            2 -> {
                holder.tvStatus.text = "Đang đợi"
                holder.imgStatus.setImageResource(R.drawable.ic_waiting)
            }
            3 -> {
                holder.tvStatus.text = "Đã hủy"
                holder.imgStatus.setImageResource(R.drawable.ic_cancel)
            }
        }
        if (position == 0){
            holder.tvLine.visibility = View.VISIBLE
        }
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvOrderName = view.findViewById(R.id.tvOrderName) as TextView
        val tvAdress = view.findViewById(R.id.tvAdress) as TextView
        val tvNote = view.findViewById(R.id.tvNote) as TextView
        val tvStatus = view.findViewById(R.id.tvStatus) as TextView
        val tvLine = view.findViewById(R.id.tvLine) as TextView
        val imgStatus = view.findViewById(R.id.imgStatus) as ImageView
    }

}