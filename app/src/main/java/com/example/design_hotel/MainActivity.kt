package com.example.design_hotel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager

import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var dot2: SpringDotsIndicator

    private lateinit var viewAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        dot2 = findViewById(R.id.dot2)


        viewAdapter = SliderAdapter(this)
        viewPager.adapter = viewAdapter
        dot2.setViewPager(viewPager)

    }
}
