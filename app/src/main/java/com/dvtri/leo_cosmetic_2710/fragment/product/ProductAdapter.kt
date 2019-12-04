package com.dvtri.leo_cosmetic_2710.fragment.product

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Product

class ProductAdapter(listProducts: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ProuctViewHolder>() {

    var listProducts : ArrayList<Product>? = null

    init {
        this.listProducts = listProducts
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProuctViewHolder {
        return ProuctViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_product, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listProducts!!.size
    }

    override fun onBindViewHolder(holder: ProuctViewHolder, position: Int) {
        val item  = listProducts!![position]
        holder.imgProduct.setImageResource(R.drawable.product_default)
        holder.tvIDProduct.text = item.productID
        holder.tvNameProduct.text = item.productName
        holder.tvStatus.text = item.quantityProduct.toString() + " " + item.unit
        holder.tvPrice.text = item.retailPrince.toString()
        holder.tvTypeProduct.text = item.category
        holder.tvNote.text = item.description
        if (position == listProducts!!.size-1)
            holder.tvLine.visibility = View.VISIBLE
        else holder.tvLine.visibility = View.GONE
    }

    class ProuctViewHolder(view : View) : RecyclerView.ViewHolder(view)  {
        var imgProduct = view.findViewById(R.id.imgProduct) as ImageView
        var tvIDProduct = view.findViewById<TextView>(R.id.tvIDProduct)
        var tvNameProduct = view.findViewById<TextView>(R.id.tvNameProduct)
        var tvStatus = view.findViewById<TextView>(R.id.tvStatus)
        var tvTypeProduct = view.findViewById<TextView>(R.id.tvTypeProduct)
        var tvPrice = view.findViewById<TextView>(R.id.tvPrice)
        var tvNote = view.findViewById<TextView>(R.id.tvNote)
        var tvLine = view.findViewById<TextView>(R.id.tvLine)
    }
}