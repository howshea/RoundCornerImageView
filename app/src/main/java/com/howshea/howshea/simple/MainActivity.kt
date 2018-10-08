package com.howshea.howshea.simple

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
            .into(img_gif)
        Glide.with(this)
            .load("https://cdn.dribbble.com/users/163341/screenshots/5349709/northernpike_teaser.jpg")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_round)
        Glide.with(this)
            .load("https://upload.jianshu.io/admin_banners/web_images/4494/9d9f6188aff3634c9fb99ec0f68299d509faae48.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/1250/h/540")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_circle)
    }
}
