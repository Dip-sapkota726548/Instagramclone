package com.dip.instagramclone.Adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dip.instagramclone.R
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.Instastoryclone
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

class InstaAdapter(var context: Context, var post: ArrayList<Instagram>) :
    RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.main,parent,false)
        return PostViewHolder(view);
    }


    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//        Picasso.get().load(post.get(position).instaprofilenameURL).into(holder.image)
//        Picasso.get().load(post.get(position).instaProfileURL).into(holder.postimage)
//        holder.name?.setText(post.get(position).instaName)
        var Instagram = post[position]
        //var Instagram = post[position]
        holder.name1 .text = Instagram.instaName
        holder.likes .text = Instagram.instalikes
        holder.caption .text = Instagram.instacaption

        Glide.with(context)

            .load(Instagram.instaProfileURL)

            .into(holder.postimage)

        Glide.with(context)
            .load(Instagram.instaprofilenameURL)
        .into(holder.image)



    }

    override fun getItemCount(): Int {
        return post.size
    }
}
class PostViewHolder(view: View) :RecyclerView.ViewHolder(view) {
     var image : CircleImageView
    var name1 : TextView
     var postimage :ImageView
     var likes : TextView
     var caption : TextView
    init {
        name1=view.findViewById(R.id.TVINSTANAME)
        postimage=view.findViewById(R.id.myimage)
        image=view.findViewById(R.id.myProfilename)
        likes = view.findViewById(R.id.TvLikes)
        caption = view.findViewById(R.id.Tvcaption)
    }
}