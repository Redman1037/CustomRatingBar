package com.github.redman1037.customratingbar

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.redman1037.custom_rating_bar.CustomRatingBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CustomRatingBar.OnCustomRatingBarChangeListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customRatingBar.onCustomRatingBarChangeListener=this

    }

    override fun onRatingChange(customRatingBar: View, rating: Float) {

        Toast.makeText(this, "Rating : $rating",Toast.LENGTH_SHORT).show()
    }
}
