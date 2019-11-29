package com.dvtri.leo_cosmetic_2710.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.dvtri.leo_cosmetic_2710.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    var animMoveUp: Animation? = null
    var animMoveDown: Animation? = null
    var animMoveLeft: Animation? = null
    var animMoveRight: Animation? = null
    var animFadeIn: Animation? = null
    var animScaleUp: Animation? = null
    private var pinCode: String = ""

    @SuppressLint("NewApi")
    override fun onClick(v: View?) {
        when (v) {
            btnNumber0 -> {
                if (pinCode.length < 6){
                    pinCode += "0"
                    animEditText(pinCode)
                } else
                    enableLogin(true)

            }
            btnNumber1 -> {
                if (pinCode.length < 6){
                    pinCode += "1"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber2 -> {
                if (pinCode.length < 6){
                    pinCode += "2"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber3 -> {
                if (pinCode.length < 6){
                    pinCode += "3"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber4 -> {
                if (pinCode.length < 6){
                    pinCode += "4"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber5 -> {
                if (pinCode.length < 6){
                    pinCode += "5"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber6 -> {
                if (pinCode.length < 6){
                    pinCode += "6"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber7 -> {
                if (pinCode.length < 6){
                    pinCode += "7"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber8 -> {
                if (pinCode.length < 6){
                    pinCode += "8"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnNumber9 -> {
                if (pinCode.length < 6){
                    pinCode += "9"
                    animEditText(pinCode)
                } else
                    enableLogin(true)
            }
            btnBackSpace -> {
//                val sb = StringBuilder(pinCode)
//                pinCode = sb.deleteCharAt(pinCode.lastIndex).toString()
                pinCode = ""
                animEditText(pinCode)
            }
            btnExit -> {
                this.finish()
            }
            imgLogin ->{
                checkLogin(pinCode)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        initUI()

    }

    private fun initUI() {


        val timer = object : CountDownTimer(200, 100) {
            override fun onTick(p0: Long) {
            }

            override fun onFinish() {
                imgLogo.startAnimation(animFadeIn)
            }

        }
        timer.start()

        val timer2 = object : CountDownTimer(2500, 100) {
            override fun onFinish() {
                imgLogo.startAnimation(animScaleUp)
            }

            override fun onTick(p0: Long) {
            }
        }
        timer2.start()

        val timer3 = object : CountDownTimer(3000, 100) {
            override fun onFinish() {
                btnNumber1.visibility = View.VISIBLE
                btnNumber2.visibility = View.VISIBLE
                btnNumber3.visibility = View.VISIBLE
                btnNumber4.visibility = View.VISIBLE
                btnNumber5.visibility = View.VISIBLE
                btnNumber6.visibility = View.VISIBLE
                btnNumber7.visibility = View.VISIBLE
                btnNumber8.visibility = View.VISIBLE
                btnNumber9.visibility = View.VISIBLE
                btnNumber0.visibility = View.VISIBLE
                btnBackSpace.visibility = View.VISIBLE
                btnExit.visibility = View.VISIBLE
                edtPassword.visibility = View.VISIBLE


                btnNumber1.startAnimation(animMoveLeft)
                btnNumber4.startAnimation(animMoveLeft)
                btnNumber7.startAnimation(animMoveLeft)
                btnExit.startAnimation(animMoveLeft)

                btnNumber3.startAnimation(animMoveRight)
                btnNumber6.startAnimation(animMoveRight)
                btnNumber9.startAnimation(animMoveRight)
                btnBackSpace.startAnimation(animMoveRight)

                btnNumber2.startAnimation(animMoveUp)
                btnNumber5.startAnimation(animMoveUp)
                btnNumber8.startAnimation(animMoveUp)
                btnNumber0.startAnimation(animMoveUp)

                edtPassword.startAnimation(animMoveDown)

            }

            override fun onTick(p0: Long) {
            }
        }
        timer3.start()


        animMoveUp = AnimationUtils.loadAnimation(this, R.anim.move_up)
        animMoveDown = AnimationUtils.loadAnimation(this,
            R.anim.zoom_in
        )
        animMoveLeft = AnimationUtils.loadAnimation(this,
            R.anim.move_left
        )
        animMoveRight = AnimationUtils.loadAnimation(this,
            R.anim.move_right
        )
        animFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        animScaleUp = AnimationUtils.loadAnimation(this,
            R.anim.scale_up
        )

        btnNumber1.setOnClickListener(this)
        btnNumber2.setOnClickListener(this)
        btnNumber3.setOnClickListener(this)
        btnNumber4.setOnClickListener(this)
        btnNumber5.setOnClickListener(this)
        btnNumber6.setOnClickListener(this)
        btnNumber7.setOnClickListener(this)
        btnNumber8.setOnClickListener(this)
        btnNumber9.setOnClickListener(this)
        btnNumber0.setOnClickListener(this)
        btnBackSpace.setOnClickListener(this)
        btnExit.setOnClickListener(this)
        imgLogin.setOnClickListener(this)
    }

    @SuppressLint("NewApi")
    private fun animEditText(pinCode: String) {
        when (pinCode.length) {
            0 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            1 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            2 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            3 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            4 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorGray, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            5 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorGray, null))
            }
            6 -> {
                tvNumber1.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber2.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber3.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber4.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber5.setTextColor(resources.getColor(R.color.colorAccent, null))
                tvNumber6.setTextColor(resources.getColor(R.color.colorAccent, null))
                enableLogin(true)
            }

        }
    }

    private fun enableLogin(isLogin:Boolean){
        if (isLogin) {
            keyBoard.visibility = View.GONE
            bgImgLogin.visibility = View.VISIBLE
            imgLogin.visibility = View.VISIBLE
        } else{
            keyBoard.visibility = View.VISIBLE
            bgImgLogin.visibility = View.INVISIBLE
            imgLogin.visibility = View.INVISIBLE

        }
    }

    private fun checkLogin(pinCode: String){
        if (pinCode.equals("123456")){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            (this as Activity).finish()
        }
        else {
            Toast.makeText(this,"Sai mã PIN, vui lòng thử lại!", Toast.LENGTH_SHORT).show()
            enableLogin(false)
        }

    }

}
