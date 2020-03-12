package com.example.matchinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.matchinmind.R
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity(R.layout.activity_game), View.OnClickListener {

    private var tempTag = ""
    private var counter = 0
    private var tempId = 0
    private var flag = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        card1.setOnClickListener(this)
        card2.setOnClickListener(this)
        card3.setOnClickListener(this)
        card4.setOnClickListener(this)
        card5.setOnClickListener(this)
        card6.setOnClickListener(this)
        card7.setOnClickListener(this)
        card8.setOnClickListener(this)
        card9.setOnClickListener(this)
        card10.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v?.id == tempId) {
            v.setBackgroundResource(R.drawable.flag_tr)
            clear()
            return
        }
        if (flag) {
            return
        }

        checkCard(v!!)
        openCard(v)


    }

    private fun openCard(v: View) {
        when (v.tag.toString()) {
            "flag_gm" -> {
                v.setBackgroundResource(R.drawable.flag_gm)
            }
            "flag_fo" -> {
                v.setBackgroundResource(R.drawable.flag_fo)
            }
            "flag_hk" -> {
                v.setBackgroundResource(R.drawable.flag_hk)
            }
            "flag_ar" -> {
                v.setBackgroundResource(R.drawable.flag_ar)
            }
            "flag_bf" -> {
                v.setBackgroundResource(R.drawable.flag_bf)
            }
        }
    }

    private fun checkCard(v: View) {
        if (counter == 1) {
            flag = true
            object : CountDownTimer(1000, 1000) {
                override fun onFinish() {
                    checkCard2(v)
                }

                override fun onTick(millisUntilFinished: Long) {}
            }.start()
        } else {
            checkCard2(v)
        }
    }

    private fun checkCard2(v: View) {
        if (v.tag.toString() == tempTag) {
            v.visibility = View.INVISIBLE
            findViewById<ImageButton>(tempId).visibility = View.INVISIBLE
        } else {
            if (counter == 1) {
                v.setBackgroundResource(R.drawable.flag_tr)
                findViewById<ImageButton>(tempId).setBackgroundResource(R.drawable.flag_tr)
            }
        }

        tempTag = v.tag.toString()
        tempId = v.id
        counter++

        if (counter == 2) {
            clear()
        }
    }

    private fun clear() {
        counter = 0
        tempId = 0
        flag = false
        tempTag = ""
    }
}