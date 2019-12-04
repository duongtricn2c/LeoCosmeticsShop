package com.dvtri.leo_cosmetic_2710.activity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dvtri.leo_cosmetic_2710.fragment.FragmentCustomers
import com.dvtri.leo_cosmetic_2710.fragment.FragmentHomePage
import com.dvtri.leo_cosmetic_2710.fragment.orders.FragmentOrders
import com.dvtri.leo_cosmetic_2710.fragment.product.FragmentProducts

@Suppress("DEPRECATION")
class PagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return FragmentHomePage.newInstance()
            1 -> return FragmentOrders.newInstance()
            2 -> return FragmentProducts.newInstance()
            3 -> return FragmentCustomers.newInstance()
            else -> return FragmentOrders.newInstance()
        }
    }

    override fun getCount(): Int {
        return 4
    }


}