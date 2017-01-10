package com.gorrotowi.ankoexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import org.jetbrains.anko.*

class SecondActivityAnko : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            padding = dip(16)
            gravity = Gravity.CENTER

            textView {
                textResource = R.string.app_name
//                this@verticalLayout.gravity = CENTER_HORIZONTAL
            }.lparams(width = wrapContent, height = wrapContent)
        }
    }
}
