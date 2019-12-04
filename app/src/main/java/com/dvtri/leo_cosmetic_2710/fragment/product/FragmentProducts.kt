package com.dvtri.leo_cosmetic_2710.fragment.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager

import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Product
import kotlinx.android.synthetic.main.fragment_products.*
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FragmentProducts.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FragmentProducts.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentProducts : Fragment() {

    var adapter : ProductAdapter? = null
    var listProduct : ArrayList<Product>? = ArrayList()

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @return A new instance of fragment FragmentProducts.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            FragmentProducts().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_products, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initUI()
    }

    private fun initUI() {
        Collections.sort(listProduct!!,object :Comparator<Product>{
            override fun compare(p0: Product?, p1: Product?): Int {
                return p1!!.productID.compareTo(p0!!.productID)
            }

        })
        adapter = ProductAdapter(listProduct!!)
        rcvProduct.layoutManager = LinearLayoutManager(this.context,LinearLayoutManager.VERTICAL, false)
        rcvProduct.setHasFixedSize(true)
        rcvProduct.adapter = adapter
    }

    private fun initData() {
        listProduct = ArrayList()
        listProduct!!.run {
            add(Product("SP00001","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00002","Kem body skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00003","Sữa tắm skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00004","Sữa rửa mặt skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00005","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00006","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00007","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00008","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00009","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
            add(Product("SP00010","Kem chống nắng skinnaz","ncc0001","k001",
                "Dưỡng da trắng đẹp",900000,1000000,1100000,
                "Lọ", 99,"image","Kem"))
        }
    }

}
