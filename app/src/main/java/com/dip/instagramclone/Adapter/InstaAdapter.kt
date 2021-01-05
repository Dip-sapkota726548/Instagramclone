package com.dip.instagramclone.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dip.instagramclone.InstagramDashboard
import com.dip.instagramclone.MainActivity
import com.dip.instagramclone.R
import com.dip.instagramclone.model.Instagram
import de.hdodenhof.circleimageview.CircleImageView

class InstaAdapter(
        val lstInstagram : ArrayList<Instagram>,
        val  context : Context
) :
        RecyclerView.Adapter<InstaAdapter.InstagramViewHolder>() {

    class InstagramViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val myProfilename : CircleImageView
        val TVINSTANAME : TextView
        val imgsettings : ImageButton
        val myimage : ImageView
        val imglove: ImageButton
        val imgcomment : ImageButton
        val imgshare: ImageButton
        val TvLikes: TextView
        val Tvcaption: TextView




        init {
            myProfilename = view.findViewById(R.id.myProfilename)
            TVINSTANAME = view.findViewById(R.id.TVINSTACLONENAME)
            imgsettings = view.findViewById(R.id.imgsettings)
            myimage = view.findViewById(R.id.myimage)
            imglove = view.findViewById(R.id.imglove)
            imgcomment = view.findViewById(R.id.imgcomment)
            imgshare = view.findViewById(R.id.imgshare)
            TvLikes = view.findViewById(R.id.TvLikes)
            Tvcaption = view.findViewById(R.id.Tvcaption)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstagramViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.mero_instagram_layout,parent, false)
        return  InstagramViewHolder(view)
    }

    override fun onBindViewHolder(holder: InstagramViewHolder, position: Int) {
        val Instagram = lstInstagram[position]
        holder.TVINSTANAME.text = Instagram.instaName
        holder.TvLikes.text = Instagram.instaLikes
        holder.Tvcaption.text = Instagram.instacaption





        Glide.with(context)
                //.load(Instagram.instaprofilenameURL)
                //.load(Instagram.instasettingsURL)
                .load(Instagram.instaProfileURL)
               // .load(Instagram.instaloveURL)
               // .load(Instagram.instacommentsURL)
                //.load(Instagram.instashareURL)

               .into(holder.myimage,)



        /// setting click listener in Recyclerview's items
//       holder.myimage.setOnClickListener {
//           // Toast.makeText(context, "${actor.actorName} clicked", Toast.LENGTH_SHORT).show()
//            val intent = Intent(context,InstagramDashboard::class.java)
//           intent.putExtra("instagram", Instagram)
//           context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int {
        return lstInstagram.size
    }
}