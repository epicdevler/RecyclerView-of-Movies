package com.epicdevler.kodecamprecyclerview.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.epicdevler.kodecamprecyclerview.Models.MovieModel
import com.epicdevler.kodecamprecyclerview.R

class MovieCyclerAdapter(private var context: Context, private var movieList: List<MovieModel>) :
    RecyclerView.Adapter<MovieCyclerAdapter.MovieViewHolder>() {
    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        var layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_layout_item, null, false)


        return MovieViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movieListItem: MovieModel = movieList[position]

        holder.movieImagePreview.setImageResource(movieListItem.moviePreviewImg)

        holder.movieTitleView.text =
            context.getString(R.string.titleText, context.getString(movieListItem.movieTitle))


        holder.movieReleaseDateView.text = context.getString(
            R.string.releaseText,
            context.getString(movieListItem.movieReleaseDate)
        )


        holder.movieDescriptionView.text = context.getString(
            R.string.detailsText,
            context.getString(movieListItem.movieDescription)
        )

    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val movieImagePreview: ImageView = itemView.findViewById(R.id.movieImagePreview)
        val movieTitleView: TextView = itemView.findViewById(R.id.movieTitle)
        val movieReleaseDateView: TextView = itemView.findViewById(R.id.movieReleaseDate)
        val movieDescriptionView: TextView = itemView.findViewById(R.id.movieDescription)

    }


}