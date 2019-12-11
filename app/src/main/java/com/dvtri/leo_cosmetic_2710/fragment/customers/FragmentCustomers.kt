package com.dvtri.leo_cosmetic_2710.fragment.customers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Customer
import kotlinx.android.synthetic.main.fragment_customers.*
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

class FragmentCustomers : Fragment(), View.OnClickListener {
    override fun onClick(view: View?) {
        when(view){
            btnAddCustomer -> {
                FragmentNewCustomer().show(fragmentManager!!,"dialog")
            }
        }
    }

    var listCustomers : ArrayList<Customer> = ArrayList()
    var adapter : CustomerAdapter? = null

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
            FragmentCustomers().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_customers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initData()
        initUI()
        btnAddCustomer.setOnClickListener(this)
    }

    private fun initUI() {
        Collections.sort(listCustomers, object : Comparator<Customer>{
            override fun compare(p0: Customer?, p1: Customer?): Int {
                return p1!!.customerID.compareTo(p0!!.customerID)
            }
        })
        adapter = CustomerAdapter(listCustomers)
        rcvCustomers.layoutManager = GridLayoutManager(this.context,3)
        rcvCustomers.setHasFixedSize(true)
        rcvCustomers.adapter = adapter
    }

    private fun initData() {
        listCustomers = ArrayList()
        listCustomers.run {
            add(
                Customer("KH00001","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,4.5)
            )
            add(Customer("KH00002","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,1.5))
            add(Customer("KH00003","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,3.5))
            add(Customer("KH00004","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,4.0))
            add(Customer("KH00005","Dương Văn Trí","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Quảng Nam",
                "GR01",false,2.0))
            add(Customer("KH00006","Hồ Thị Hà","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Đồng Nai",
                "GR01",false,3.0))
            add(Customer("KH00007","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,2.5))
            add(Customer("KH00008","Nguyễn Anh Thư","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Hồ Chí Minh",
                "GR01",false,2.0))
            add(Customer("KH00009","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,3.0))
            add(Customer("KH00010","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,2.5))
            add(Customer("KH00011","Dương Thị Thơ","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Đà Nẵng",
                "GR01",false,4.5))
            add(Customer("KH00012","Mai Thi Hoài","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,3.5))
            add(Customer("KH00013","Bùi Thúy Hoàng Oanh","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Khánh Hòa",
                "GR01",false,1.0))
            add(Customer("KH00014","Nguyễn Thị Hoa","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Nha Trang",
                "GR01",false,0.5))
            add(Customer("KH00015","Trần Anh Tuấn","0334928868",
                "hoangOanh123@gmail.com","Kuuyn,Đắk Lắk", 22,"Lâm Đồng",
                "GR01",false,2.5))
        }
    }
}
