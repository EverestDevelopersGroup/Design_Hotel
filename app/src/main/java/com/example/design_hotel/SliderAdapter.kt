package com.example.design_hotel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter(context: Context) : PagerAdapter() {

    private val images = arrayOf(
        R.drawable.img,
        R.drawable.mushuk,
        R.drawable.malina,
        R.drawable.rano,

    )

    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = layoutInflater.inflate(R.layout.slide_layout, container, false)
        val imageView = view.findViewById<ImageView>(R.id.image_view)
        imageView.setImageResource(images[position])

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
