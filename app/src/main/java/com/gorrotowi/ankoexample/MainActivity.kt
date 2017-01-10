package com.gorrotowi.ankoexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goXml(v: View) {
        startActivity(intentFor<SecondActivityXML>())
    }

    fun goAnko(v: View) {
        startActivity(intentFor<SecondActivityAnko>())
    }

}
