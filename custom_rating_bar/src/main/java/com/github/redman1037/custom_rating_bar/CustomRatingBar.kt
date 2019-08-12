package com.github.redman1037.custom_rating_bar

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Manohar on 09-08-2019.
 */
class CustomRatingBar : FrameLayout {

    lateinit var recyclerView:RecyclerView
    lateinit var adapter:CustomRatingBarAdapter

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context,attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context,attrs,defStyleAttr)
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(context,attrs, defStyleAttr, defStyleRes)
    }

    private fun init(  context: Context,
                      attrs: AttributeSet?=null,
                      defStyleAttr: Int=0,
                      defStyleRes: Int=0) {

        var view=LayoutInflater.from(context).inflate(R.layout.custom_rating_bar,this,true)


        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        adapter= CustomRatingBarAdapter(context)
        adapter.rating=3.0f

        recyclerView.adapter=adapter



    }

}