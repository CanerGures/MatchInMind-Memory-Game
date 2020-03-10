package com.example.matchinmind

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEasy.setOnClickListener(this)
        btnAvarage.setOnClickListener(this)
        btnHard.setOnClickListener(this)
        btnLegacy.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v == null) {
            return
        }
        when (v.id) {
            R.id.btnEasy -> {

            }
            R.id.btnAvarage -> {

            }
            R.id.btnHard -> {

            }
            R.id.btnLegacy -> {

            }

        }
    }


}
