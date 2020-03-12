package com.example.matchinmind

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.matchinmind.enums.GameOption
import com.example.matchinmind.enums.ParamKey
import com.example.matchinmind.ui.GameActivity
import com.example.matchinmind.util.extStartActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnEasy.setOnClickListener(this)
//        btnAvarage.setOnClickListener(this)
//        btnHard.setOnClickListener(this)
//        btnLegacy.setOnClickListener(this)


        btnEasy.setOnClickListener {
            startGameActivity(GameOption.EASY)
        }
        btnAverage.setOnClickListener {
            startGameActivity(GameOption.AVERAGE)
        }
        btnHard.setOnClickListener {
            startGameActivity(GameOption.HARD)
        }
        btnLegacy.setOnClickListener {
            startGameActivity(GameOption.LEGACY)

        }

    }

    private fun startGameActivity(gameOption: GameOption) {
        val bundle = Bundle()
        bundle.putString(ParamKey.GAME_OPTION.name, gameOption.name)
        this.extStartActivity(GameActivity::class.java, bundle)
    }


//    override fun onClick(v: View?) {
//        if (v == null) {
//            return
//        }
//        when (v.id) {
//            R.id.btnEasy -> {
//
//            }
//            R.id.btnAvarage -> {
//
//            }
//            R.id.btnHard -> {
//
//            }
//            R.id.btnLegacy -> {
//
//            }
//
//        }
//    }




}
