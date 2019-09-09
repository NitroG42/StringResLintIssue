package com.nitrog42.stringreslintissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = TestFragmentArgs(MYENUM.FIRST).myenum
        test.apply {
            //WORKING
            textView.setText(title)
            //WORKING
            textView.text = getString(MYENUM.FIRST.title)
            //LINT FAIL
            textView.text = getString(title)
        }

        //WORKING
        getString(test.title)
        //LINT FAIL
        test.apply {
            getString(title)
        }
    }
}