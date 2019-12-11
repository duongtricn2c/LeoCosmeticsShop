package com.dvtri.leo_cosmetic_2710.fragment.customers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import com.dvtri.leo_cosmetic_2710.R
import android.content.Intent
import android.app.Activity
import android.graphics.BitmapFactory
import android.provider.MediaStore
import java.time.format.ResolverStyle


class FragmentNewCustomer : DialogFragment(), View.OnClickListener {
    override fun onClick(view: View?) {
        when(view){
            imgSelectAvatar -> {
                Toast.makeText(this.context,"Chọn ảnh đại diện",Toast.LENGTH_SHORT).show()
                pickFromGallery()
            }
            imgStar1 ->{
                imgStar1!!.setImageResource(R.drawable.ic_star)
                imgStar2!!.setImageResource(R.drawable.ic_star_border)
                imgStar3!!.setImageResource(R.drawable.ic_star_border)
                imgStar4!!.setImageResource(R.drawable.ic_star_border)
                imgStar5!!.setImageResource(R.drawable.ic_star_border)
            }
            imgStar2 ->{
                imgStar1!!.setImageResource(R.drawable.ic_star)
                imgStar2!!.setImageResource(R.drawable.ic_star)
                imgStar3!!.setImageResource(R.drawable.ic_star_border)
                imgStar4!!.setImageResource(R.drawable.ic_star_border)
                imgStar5!!.setImageResource(R.drawable.ic_star_border)
            }
            imgStar3 ->{
                imgStar1!!.setImageResource(R.drawable.ic_star)
                imgStar2!!.setImageResource(R.drawable.ic_star)
                imgStar3!!.setImageResource(R.drawable.ic_star)
                imgStar4!!.setImageResource(R.drawable.ic_star_border)
                imgStar5!!.setImageResource(R.drawable.ic_star_border)
            }
            imgStar4 ->{
                imgStar1!!.setImageResource(R.drawable.ic_star)
                imgStar2!!.setImageResource(R.drawable.ic_star)
                imgStar3!!.setImageResource(R.drawable.ic_star)
                imgStar4!!.setImageResource(R.drawable.ic_star)
                imgStar5!!.setImageResource(R.drawable.ic_star_border)
            }
            imgStar5 ->{
                imgStar1!!.setImageResource(R.drawable.ic_star)
                imgStar2!!.setImageResource(R.drawable.ic_star)
                imgStar3!!.setImageResource(R.drawable.ic_star)
                imgStar4!!.setImageResource(R.drawable.ic_star)
                imgStar5!!.setImageResource(R.drawable.ic_star)
            }
        }
    }

    private var imgSelectAvatar :ImageView? = null
    private var imgStar1 :ImageView?= null
    private var imgStar2 :ImageView?= null
    private var imgStar3 :ImageView?= null
    private var imgStar4 :ImageView?= null
    private var imgStar5 :ImageView?= null
    private val GALLERY_REQUEST_CODE = 2010

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout : View = inflater.inflate(R.layout.fragment_new_customer, container, false)
        imgSelectAvatar = layout.findViewById(R.id.imgSelectAvatar)
        imgStar1 = layout.findViewById(R.id.imgStar1)
        imgStar2 = layout.findViewById(R.id.imgStar2)
        imgStar3 = layout.findViewById(R.id.imgStar3)
        imgStar4 = layout.findViewById(R.id.imgStar4)
        imgStar5 = layout.findViewById(R.id.imgStar5)
        return layout
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.AppTheme)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        imgSelectAvatar!!.setOnClickListener(this)
        imgStar1!!.setOnClickListener(this)
        imgStar2!!.setOnClickListener(this)
        imgStar3!!.setOnClickListener(this)
        imgStar4!!.setOnClickListener(this)
        imgStar5!!.setOnClickListener(this)
    }

    fun pickFromGallery() {
        //Create an Intent with action as ACTION_PICK
        val intent = Intent(Intent.ACTION_PICK)
        // Sets the type as image/*. This ensures only components of type image are selected
        intent.type = "image/*"
        //We pass an extra array with the accepted mime types. This will ensure only components with these MIME types as targeted.
        val mimeTypes = arrayOf("image/jpeg", "image/png")
        intent.putExtra(Intent.EXTRA_MIME_TYPES, mimeTypes)
        // Launching the Intent
        startActivityForResult(intent, GALLERY_REQUEST_CODE)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // Result code is RESULT_OK only if the user selects an Image
        if (resultCode == Activity.RESULT_OK)
            when (requestCode) {
                GALLERY_REQUEST_CODE -> {
                    //data.getData return the content URI for the selected Image
                    val selectedImage = data!!.data
                    val filePathColumn = arrayOf(MediaStore.Images.Media.DATA)
                    // Get the cursor
                    val cursor = this.context!!.contentResolver.query(selectedImage!!, filePathColumn, null, null, null)
                    // Move to first row
                    cursor!!.moveToFirst()
                    //Get the column index of MediaStore.Images.Media.DATA
                    val columnIndex = cursor.getColumnIndex(filePathColumn[0])
                    //Gets the String value in the column
                    val imgDecodableString = cursor.getString(columnIndex)
                    cursor.close()
                    // Set the Image in ImageView after decoding the String
                    imgSelectAvatar!!.setImageBitmap(BitmapFactory.decodeFile(imgDecodableString))
                }
            }
    }

}
