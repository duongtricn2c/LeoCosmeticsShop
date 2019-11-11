package com.dvtri.leo_cosmetic_2710.activity

import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.dvtri.leo_cosmetic_2710.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter: PagerAdapter? = null
    private var oldMenu = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = PagerAdapter(supportFragmentManager)
        containers.adapter = PagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(containers)
        for (i in 0..3){
            setViewTabMenu(i)
        }
        containers.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> tabLayout.getTabAt(0)!!.setCustomView(R.layout.menu_home_page_selected)
                    1 -> tabLayout.getTabAt(1)!!.setCustomView(R.layout.menu_orders_selected)
                    2 -> tabLayout.getTabAt(2)!!.setCustomView(R.layout.menu_products_selected)
                    3 -> tabLayout.getTabAt(3)!!.setCustomView(R.layout.menu_customers_selected)
                }
                if (position != oldMenu)
                    setViewTabMenu(oldMenu)
            }
        })
    }


    fun setViewTabMenu(pos: Int) {
        when (pos) {
            0 -> tabLayout.getTabAt(0)!!.setCustomView(R.layout.menu_home_page)
            1 -> tabLayout.getTabAt(1)!!.setCustomView(R.layout.menu_orders)
            2 -> tabLayout.getTabAt(2)!!.setCustomView(R.layout.menu_products)
            3 -> tabLayout.getTabAt(3)!!.setCustomView(R.layout.menu_customers)
        }
    }
}
