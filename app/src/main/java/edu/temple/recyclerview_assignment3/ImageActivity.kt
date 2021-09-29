package edu.temple.recyclerview_assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flowers = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        fun getPictures() : Array<ImageObject>{
            return arrayOf( ImageObject(R.drawable.flower1, "blueberry-ish flower"),
            ImageObject(R.drawable.flower2, "succulent-ish flower"),
            ImageObject(R.drawable.flower3, "blue jellyfish flower"),
            ImageObject(R.drawable.flower4, "little pink chrysanthemum"),
            ImageObject(R.drawable.flower5, "violet"),
            ImageObject(R.drawable.flower6, "yellow berry flower"),
            ImageObject(R.drawable.flower7, "bulb flower with orange petals"),
            ImageObject(R.drawable.flower8, "white daisies"),
            ImageObject(R.drawable.flower9, "white flower hairpiece"),
            ImageObject(R.drawable.flower10, "little blue foxgloves"),
            ImageObject(R.drawable.flower11, "orange orchid"),
            ImageObject(R.drawable.flower12, "pink-red pinwheel flowers"),
            ImageObject(R.drawable.flower13, "red flower hairpiece"),
            ImageObject(R.drawable.flower14, "pink-red flower"),
            ImageObject(R.drawable.flower15, "purple cat-tails"),
            ImageObject(R.drawable.flower16, "blue lantern flower"),
        )
        }
        val adapter = ImageAdapter(this, getPictures())
        flowers.adapter = ImageAdapter(this, getPictures())
        flowers.layoutManager = GridLayoutManager(this, 4)


    }
}