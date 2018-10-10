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
        img_gif.apply {
            borderWidth = 20f
            ratio = 1.333f
            radius = 30f
        }
        Glide.with(this)
            .load("https://cdn.dribbble.com/users/4874/screenshots/3704428/comms.gif")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_gif)
        Glide.with(this)
            .load("https://cdn.dribbble.com/users/1776998/screenshots/5362063/attachments/1162575/artboard_copy_20_2x.png")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_round)
        Glide.with(this)
            .load("https://upload.jianshu.io/admin_banners/web_images/4494/9d9f6188aff3634c9fb99ec0f68299d509faae48.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/1250/h/540")
            .apply(RequestOptions().placeholder(R.color.placeHolder))
            .into(img_circle)
    }
}
