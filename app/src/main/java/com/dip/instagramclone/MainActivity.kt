package com.dip.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dip.instagramclone.Adapter.InstaAdapter
import com.dip.instagramclone.Adapter.InstaStoryAdapter
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.Instastoryclone

class MainActivity : AppCompatActivity() {
    private var lstInstagram = ArrayList<Instagram>()
    private var lstinstastory = ArrayList<Instastoryclone>()
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerview1: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView2 = findViewById(R.id.recyclerview2)
        recyclerview1 = findViewById(R.id.recyclerview1)

        //second function
        loadInstastoryclone()
        val adapter1 = InstaStoryAdapter(lstinstastory, this)

        loadInstagram()
        val adapter = InstaAdapter(lstInstagram,this)

        recyclerView2.layoutManager = LinearLayoutManager(this)
        recyclerView2.adapter = adapter

        recyclerview1.layoutManager = LinearLayoutManager(this)
        recyclerview1.adapter = adapter1

    }

    private fun loadInstastoryclone() {
        lstinstastory.add((Instastoryclone(1, "https://bestcelebspicture.files.wordpress.com/2011/08/sadichha_in_newari_dress.jpg", "Saddicha")))

        lstinstastory.add((Instastoryclone(2, "https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg", "Rajesh")))

        lstinstastory.add((Instastoryclone(3, "https://images.indulgexpress.com/uploads/user/imagelibrary/2018/5/9/w600X390/VijayDevarakonda.jpg", "Vijay")))
    }

    private fun loadInstagram() {
        lstInstagram.add((Instagram( 1, "https://bestcelebspicture.files.wordpress.com/2011/08/sadichha_in_newari_dress.jpg", "Sadichha", "", "https://bestcelebspicture.files.wordpress.com/2011/08/sadichha_in_newari_dress.jpg"
        )))

        lstInstagram.add((Instagram(2, "https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg", "Rajesh", "data:image/png;base64,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", "https://myrepublica.nagariknetwork.com/uploads/media/RajeshHamal.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWl-KIok1BG1O_5OTKRGJC2UtSsgSsEbiF-g&usqp=CAU","https://icon-library.com/images/instagram-comment-icon/instagram-comment-icon-15.jpg", "https://www.pngkit.com/png/full/188-1882778_icon-icon-icon-icon-instagram-share-icon-png.png", "400K Likes", "Rajeshhml: Good wishes 2021"

        )))




    }

}


