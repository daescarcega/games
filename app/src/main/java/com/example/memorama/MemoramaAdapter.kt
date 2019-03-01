package com.example.memorama

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.games.R
import kotlinx.android.synthetic.main.renglon.view.*

class MemoramaAdapter(val chips: ArrayList<Chip>):

    RecyclerView.Adapter<MemoramaAdapter.ChipViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ChipViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.renglon, p0, false)
        return ChipViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  chips.size
    }

    override fun onBindViewHolder(p0: ChipViewHolder, p1: Int) {
        p0.imageView.setImageResource(chips[p1].idImage)
    }


    inner class ChipViewHolder(item : View) : RecyclerView.ViewHolder(item){
        val imageView = item.findViewById<ImageView>(R.id.chip)

        init {
            item.setOnClickListener {
                imageView.setImageResource(R.drawable.rocket)
            }
        }
    }

}
