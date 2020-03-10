package com.example.matchinmind.util

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.ColorRes
import androidx.appcompat.app.AppCompatActivity

infix fun <ClassName> Context.extStartActivty(cls: Class<ClassName>) {
    startActivity(Intent(this, cls))
}


infix fun AppCompatActivity.changeStatusColor(@ColorRes id: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        window.statusBarColor = resources.getColor(id, this.theme)
    } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.statusBarColor = resources.getColor(id)
    }
}