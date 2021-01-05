package com.dip.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.dip.instagramclone.model.Instagram
import de.hdodenhof.circleimageview.CircleImageView

class InstagramDashboard : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram_dashboard)





//        var Instagram = intent.getSerializableExtra("instagram") as Instagram
//
//        var imageUrl = Instagram.instaProfileURL
//
//        Glide.with(this@InstagramDashboard)
//            .load(imageUrl)
//            .into(myimage)
    }
}