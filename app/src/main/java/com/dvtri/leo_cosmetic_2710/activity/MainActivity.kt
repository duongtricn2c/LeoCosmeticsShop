package com.dvtri.leo_cosmetic_2710.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dvtri.leo_cosmetic_2710.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        containers.adapter = PagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(containers)

    }
}
