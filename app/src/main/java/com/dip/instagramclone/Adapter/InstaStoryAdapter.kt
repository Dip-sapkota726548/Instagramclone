package com.dip.instagramclone.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dip.instagramclone.R
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.Instastoryclone
import de.hdodenhof.circleimageview.CircleImageView
import java.util.ArrayList

class InstaStoryAdapter(var context: Context, var lstprofiles: ArrayList<Instastoryclone>) :
        RecyclerView.Adapter<ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.mero_instagram_layout,parent,false)
        return ProfileViewHolder(view);
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
//        Glide.with(context).load(profiles.get(position).image).into(holder.image)
//        Glide.get().load(lstprofiles.get(position).storyimageURl).into(holder.image)
//        holder.name.setText(lstprofiles.get(position).instastoryname)

        var Instastoryclone = lstprofiles[position]
        holder.name.text = Instastoryclone.instastoryname

        Glide.with(context)
                .load(Instastoryclone.storyimageURl)
                .into(holder.image)
    }
    override fun getItemCount(): Int {
        return lstprofiles.size
    }
}
class ProfileViewHolder(view: View) :RecyclerView.ViewHolder(view) {
    var image : CircleImageView;
    var name : TextView;
    init {
        image = view.findViewById(R.id.INSTACIRCLEPROFILE)
        name = view.findViewById(R.id.TVINSTACLONENAME)
    }
}