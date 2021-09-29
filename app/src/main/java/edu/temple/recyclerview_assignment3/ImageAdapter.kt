package edu.temple.recyclerview_assignment3

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_context: Context, private val _imageObjects : Array<ImageObject>, _ocl : View.OnClickListener) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    val ocl = _ocl
        // this is a generic declaration for the datatype I made, ImageViewHolder
    class ImageViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
            val imageView: ImageView = view.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val flower = LayoutInflater.from(parent.context)
        return ImageViewHolder(flower as View)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val flower : ImageObject = _imageObjects[position]
        holder.imageView.setImageResource(flower.resourceId)

        holder.imageView.setOnClickListener(ocl)
    }

    override fun getItemCount() = _imageObjects.size

}