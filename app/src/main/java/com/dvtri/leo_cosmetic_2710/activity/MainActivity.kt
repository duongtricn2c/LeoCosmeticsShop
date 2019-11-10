package com.dvtri.leo_cosmetic_2710.activity

import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.dvtri.leo_cosmetic_2710.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter : PagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = PagerAdapter(supportFragmentManager)
        containers.adapter = PagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(containers)
        setViewTabMenu()
        containers.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                adapter!!.notifyDataSetChanged()
            }

        })

    }

    fun setViewTabMenu(){
        tabLayout.getTabAt(0)!!.setCustomView(R.layout.menu_home_page)
        tabLayout.getTabAt(1)!!.setCustomView(R.layout.menu_orders)
        tabLayout.getTabAt(2)!!.setCustomView(R.layout.menu_products)
        tabLayout.getTabAt(3)!!.setCustomView(R.layout.menu_customers)
    }
}
