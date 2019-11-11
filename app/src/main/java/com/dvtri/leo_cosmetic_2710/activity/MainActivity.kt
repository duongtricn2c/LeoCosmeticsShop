package com.dvtri.leo_cosmetic_2710.activity

import android.annotation.SuppressLint
import android.graphics.pdf.PdfDocument
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.viewpager.widget.ViewPager
import com.dvtri.leo_cosmetic_2710.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.menu_customers.view.*
import kotlinx.android.synthetic.main.menu_home_page.view.*
import kotlinx.android.synthetic.main.menu_orders.view.*
import kotlinx.android.synthetic.main.menu_products.view.*

class MainActivity : AppCompatActivity() {
    private var adapter: PagerAdapter? = null
    private var oldMenu = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = PagerAdapter(supportFragmentManager)
        containers.adapter = PagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(containers)
        setViewTabMenu()
        containers.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            @RequiresApi(Build.VERSION_CODES.M)
            @SuppressLint("NewApi")
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        tabLayout.getTabAt(0)!!.view.tvHomePage.setTextColor(getColor(R.color.textMenuSelect))
                        tabLayout.getTabAt(0)!!.view.iconHomePage.setImageResource(R.drawable.home_page_selected)
                    }
                    1 -> {
                        tabLayout.getTabAt(1)!!.view.tvOrder.setTextColor(getColor(R.color.textMenuSelect))
                        tabLayout.getTabAt(1)!!.view.imgOrder.setImageResource(R.drawable.order_icon_selected)
                    }
                    2 -> {
                        tabLayout.getTabAt(2)!!.view.tvProduct.setTextColor(getColor(R.color.textMenuSelect))
                        tabLayout.getTabAt(2)!!.view.iconProduct.setImageResource(R.drawable.product_icon_selected)
                    }
                    3 -> {
                        tabLayout.getTabAt(3)!!.view.tvCustomer.setTextColor(getColor(R.color.textMenuSelect))
                        tabLayout.getTabAt(3)!!.view.imgCustomer.setImageResource(R.drawable.customer_icon_selected)
                    }
                }
                if (position != oldMenu) {
                    when (oldMenu) {
                        0 -> {
                            tabLayout.getTabAt(0)!!.view.tvHomePage.setTextColor(getColor(R.color.textMenuColor))
                            tabLayout.getTabAt(0)!!.view.iconHomePage.setImageResource(R.drawable.home_page)
                        }
                        1 -> {
                            tabLayout.getTabAt(1)!!.view.tvOrder.setTextColor(getColor(R.color.textMenuColor))
                            tabLayout.getTabAt(1)!!.view.imgOrder.setImageResource(R.drawable.order_icon)
                        }
                        2 -> {
                            tabLayout.getTabAt(2)!!.view.tvProduct.setTextColor(getColor(R.color.textMenuColor))
                            tabLayout.getTabAt(2)!!.view.iconProduct.setImageResource(R.drawable.product_icon)
                        }
                        3 -> {
                            tabLayout.getTabAt(3)!!.view.tvCustomer.setTextColor(getColor(R.color.textMenuColor))
                            tabLayout.getTabAt(3)!!.view.imgCustomer.setImageResource(R.drawable.customer_icon)
                        }
                    }
                }
                oldMenu = position
            }
        })
    }


    fun setViewTabMenu() {
        tabLayout.getTabAt(0)!!.setCustomView(R.layout.menu_home_page)
        tabLayout.getTabAt(1)!!.setCustomView(R.layout.menu_orders)
        tabLayout.getTabAt(2)!!.setCustomView(R.layout.menu_products)
        tabLayout.getTabAt(3)!!.setCustomView(R.layout.menu_customers)

    }
}
