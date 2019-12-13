package com.dvtri.leo_cosmetic_2710.fragment.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.dvtri.leo_cosmetic_2710.R

class FragmentAddProduct : DialogFragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_add_new_product,container,false)
        return layout

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //set style view
        setStyle(STYLE_NORMAL, R.style.AppTheme)
    }
}