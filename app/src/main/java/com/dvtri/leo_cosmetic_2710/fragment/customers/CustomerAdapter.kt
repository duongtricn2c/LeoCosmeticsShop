package com.dvtri.leo_cosmetic_2710.fragment.customers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Customer

class CustomerAdapter(listCustomer :ArrayList<Customer>) : RecyclerView.Adapter<CustomerAdapter.CustomerHolder>() {
    var listCustomers : ArrayList<Customer>? = null

    init {
        this.listCustomers = listCustomer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerHolder {
        return CustomerHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_customer, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listCustomers!!.size
    }

    override fun onBindViewHolder(holder: CustomerHolder, position: Int) {
        val item = listCustomers!![position]
        holder.imgAvatar.setImageResource(R.drawable.avatar_default)
        holder.tvNameCustomer.text = item.nameContact
        holder.tvIdCustomer.text = item.customerID
        holder.tvPhone.text = item.phoneNumber
        holder.tvBirthday.text = item.age.toString()
        holder.tvGender.text = getGender(item.gender)
        holder.tvAdress.text = item.city
        getRank(item.rank,holder.imgStar1, holder.imgStar2, holder.imgStar3,holder.imgStar4,holder.imgStar5)
    }

    private fun getRank(rank:Double?,imgStar1: ImageView, imgStar2: ImageView, imgStar3: ImageView, imgStar4: ImageView, imgStar5: ImageView) {
        when(rank){
            0.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star_border)
                imgStar2.setImageResource(R.drawable.ic_star_border)
                imgStar3.setImageResource(R.drawable.ic_star_border)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            0.5 -> {
                imgStar1.setImageResource(R.drawable.ic_star_half)
                imgStar2.setImageResource(R.drawable.ic_star_border)
                imgStar3.setImageResource(R.drawable.ic_star_border)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            1.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star_border)
                imgStar3.setImageResource(R.drawable.ic_star_border)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            1.5 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star_half)
                imgStar3.setImageResource(R.drawable.ic_star_border)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            2.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star_border)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            2.5 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star_half)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            3.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star)
                imgStar4.setImageResource(R.drawable.ic_star_border)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            3.5 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star)
                imgStar4.setImageResource(R.drawable.ic_star_half)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            4.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star)
                imgStar4.setImageResource(R.drawable.ic_star)
                imgStar5.setImageResource(R.drawable.ic_star_border)
            }
            4.5 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star)
                imgStar4.setImageResource(R.drawable.ic_star)
                imgStar5.setImageResource(R.drawable.ic_star_half)
            }
            5.0 -> {
                imgStar1.setImageResource(R.drawable.ic_star)
                imgStar2.setImageResource(R.drawable.ic_star)
                imgStar3.setImageResource(R.drawable.ic_star)
                imgStar4.setImageResource(R.drawable.ic_star)
                imgStar5.setImageResource(R.drawable.ic_star)
            }
        }
    }

    private fun getGender(gender: Boolean): String {
        if (gender)
            return "Nam"
        else
            return "Nữ"
    }

    class CustomerHolder (view : View) : RecyclerView.ViewHolder(view){
        var imgAvatar = view.findViewById<ImageView>(R.id.imgAvatar)
        var imgStar1 = view.findViewById<ImageView>(R.id.imgStar1)
        var imgStar2 = view.findViewById<ImageView>(R.id.imgStar2)
        var imgStar3 = view.findViewById<ImageView>(R.id.imgStar3)
        var imgStar4 = view.findViewById<ImageView>(R.id.imgStar4)
        var imgStar5 = view.findViewById<ImageView>(R.id.imgStar5)
        var tvNameCustomer = view.findViewById<TextView>(R.id.tvNameCustomer)
        var tvPhone = view.findViewById<TextView>(R.id.tvPhone)
        var tvBirthday = view.findViewById<TextView>(R.id.tvBirthday)
        var tvGender = view.findViewById<TextView>(R.id.tvGender)
        var tvAdress = view.findViewById<TextView>(R.id.tvAdress)
        var tvIdCustomer = view.findViewById<TextView>(R.id.tvIdCustomer)
    }
}