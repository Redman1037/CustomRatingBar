package com.github.redman1037.custom_rating_bar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by Manohar on 12-08-2019.
 */


class CustomRatingBarAdapter (val context: Context,val itemLayout:Int=R.layout.item_star_drawable) : RecyclerView.Adapter<CustomRatingBarAdapter.MyviewHolder>(),
    View.OnClickListener {

    var rating:Float = 0.0f
    var selectedStarColor:Int=R.color.selected_star_color
    var unSelectedStarColor:Int=R.color.un_selected_star_color

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(itemLayout, parent, false)
        return MyviewHolder(view)
    }

    override fun getItemCount(): Int {

        return 5
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {


        if(position<rating){
            holder.starImage.setTint(selectedStarColor)
        }else{
            holder.starImage.setTint(unSelectedStarColor)
        }

        holder.starImage.tag=position
        holder.starImage.setOnClickListener(this)

    }


   inner class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val starImage:ImageView=itemView.findViewById(R.id.custom_star_imageView)
    }


    override fun onClick(v: View?) {
         val position = v?.tag as Int
          when (v.id) {
             R.id.custom_star_imageView ->{
                 rating=(position+1).toFloat()
                 notifyDataSetChanged()

             }
         }
    }


}