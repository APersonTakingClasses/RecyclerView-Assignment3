package edu.temple.recyclerview_assignment3

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_context: Context, _imageObjects : Array<ImageObject>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
        // this is a generic declaration for the datatype I made, ImageViewHolder
    class ImageViewHolder(_itemView: ImageView) : RecyclerView.ViewHolder(_itemView){
        val _imageView = _itemView
    }

    val context = _context
    val imageObjects = _imageObjects
    val inflator  = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}