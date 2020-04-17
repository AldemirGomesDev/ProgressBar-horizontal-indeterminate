package com.aldemir.progressbarinfinity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_search.visibility = View.VISIBLE
        progressBarSync.visibility = View.GONE

    }

    fun toSimulate(view: View) {
        view_search.visibility = View.GONE
        progressBarSync.visibility = View.VISIBLE
    }

    fun toSimulateStop(view: View) {
        view_search.visibility = View.VISIBLE
        progressBarSync.visibility = View.GONE
    }
}
