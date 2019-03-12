package com.example.images

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButtonClick(view: View){
        if(view == rb_eevee){
            //telling to use image view to use the image
        pokemon.setImageResource(R.drawable.Eevee)
        }

        if(view == rb_pikachu){
            //telling to use image view to use the image
            pokemon.setImageResource(R.drawable.Pikachu)
        }
        if(view == rb_rockruff){
            //telling to use image view to use the image
            pokemon.setImageResource(R.drawable.Rockruff)
        }
    }
}
