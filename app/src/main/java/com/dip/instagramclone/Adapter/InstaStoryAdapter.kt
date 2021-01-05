package com.dip.instagramclone.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dip.instagramclone.R
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.Instastoryclone
import de.hdodenhof.circleimageview.CircleImageView

class InstaStoryAdapter (
        val lstinstastory : ArrayList<Instastoryclone>,
        val  context : Context
) :
        RecyclerView.Adapter<InstaStoryAdapter.InstastorycloneViewHolder>() {

    class InstastorycloneViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val INSTACIRCLEPROFILE : CircleImageView
        val TVINSTACLONENAME: TextView




        init {
            INSTACIRCLEPROFILE = view.findViewById(R.id.INSTACIRCLEPROFILE)
            TVINSTACLONENAME = view.findViewById(R.id.TVINSTACLONENAME)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstastorycloneViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.mero_instagram_layout,parent, false)
        return  InstastorycloneViewHolder(view)
    }

    override fun onBindViewHolder(holder: InstastorycloneViewHolder, position: Int) {
        val Instastoryclone = lstinstastory[position]
        holder.TVINSTACLONENAME.text = Instastoryclone.instastoryname




        Glide.with(context)
                .load(Instastoryclone.storyimageURl)
                //.load(Instagram.instasettingsURL)

                // .load(Instagram.instaloveURL)
                // .load(Instagram.instacommentsURL)
                //.load(Instagram.instashareURL)

                .into(holder.INSTACIRCLEPROFILE,)



        /// setting click listener in Recyclerview's items
//       holder.myimage.setOnClickListener {
//           // Toast.makeText(context, "${actor.actorName} clicked", Toast.LENGTH_SHORT).show()
//            val intent = Intent(context,InstagramDashboard::class.java)
//           intent.putExtra("instagram", Instagram)
//           context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int {
        return lstinstastory.size
    }
}