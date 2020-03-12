package com.example.matchinmind.ui

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.matchinmind.MainActivity
import com.example.matchinmind.R
import com.example.matchinmind.util.changeStatusColor
import com.example.matchinmind.util.extStartActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        this changeStatusColor android.R.color.black

        object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                this@SplashActivity.extStartActivity(MainActivity::class.java)
            }

            override fun onTick(millisUntilFinished: Long) {

            }

        }.start()
    }
}
