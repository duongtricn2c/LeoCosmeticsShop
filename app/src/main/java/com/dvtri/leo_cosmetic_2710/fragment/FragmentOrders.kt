package com.dvtri.leo_cosmetic_2710.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.dvtri.leo_cosmetic_2710.R
import com.dvtri.leo_cosmetic_2710.data.Order
import kotlinx.android.synthetic.main.fragment_orders.*

class FragmentOrders : Fragment() {
    var listOrders : ArrayList<Order> = ArrayList()
    var adapter : OrderAdapter? = null

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
            FragmentOrders().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_orders, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
        initUI()
    }

    private fun initUI() {
        adapter = OrderAdapter(listOrders)
        rlvOrders.layoutManager = LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, true)
        rlvOrders.setHasFixedSize(true)
        rlvOrders.adapter = adapter
    }

    private fun initData() {
        listOrders.run {
            add(
                Order("ODS00001",
                "Bùi Thúy Hoàng Oanh","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","1","Chưa thanh toán")
            )
            add(Order("ODS00002",
                "Hoàng Anh Việt","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","1","Chưa thanh toán"))
            add(Order("ODS00003",
                "Nguyễn Thị Hoa","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","2","Chưa thanh toán"))
            add(Order("ODS00004",
                "Trần Anh Nhân","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","1","Chưa thanh toán"))
            add(Order("ODS00005",
                "Mai Thị Lựu Đạn","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","3","Chưa thanh toán"))
            add(Order("ODS00006",
                "Huỳnh Thị Phương","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","2","Chưa thanh toán"))
            add(Order("ODS00007",
                "Hồ Mỹ Trân","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","2","Chưa thanh toán"))
            add(Order("ODS00008",
                "Bùi Anh Tuấn","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","2","Chưa thanh toán"))
            add(Order("ODS00009",
                "Nguyễn Khởi My","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","3","Chưa thanh toán"))
            add(Order("ODS00010",
                "Lê Trúc Phương","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","1","Chưa thanh toán"))
            add(Order("ODS00011",
                "Mai Thị Nhàn","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","2","Chưa thanh toán"))
            add(Order("ODS00012",
                "Lê Dương Bảo Lâm","01/12/2019",
                "02/12/2019",30000,"02/12/2019",
                "59 Lê Thành Phương, TP Nha Trang","1","Chưa thanh toán"))
        }
    }

}
