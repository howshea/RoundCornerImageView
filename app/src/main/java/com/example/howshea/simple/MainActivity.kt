package com.example.howshea.simple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Glide.with(this)
            .load("https://ww1.sinaimg.cn/large/0073sXn7ly1fvexcqf3xeg309j0h3nhg?imageView2/2/w/460")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_round)
    }
}
