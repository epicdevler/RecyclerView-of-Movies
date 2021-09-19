package com.epicdevler.kodecamprecyclerview.DataSources

import com.epicdevler.kodecamprecyclerview.Models.MovieModel
import com.epicdevler.kodecamprecyclerview.R

class MoviesData {

    //    SET AND RETURN MOVIES WITH HARDCODED STRINGS
    fun loadMovies(): List<MovieModel> {
        return listOf(
            MovieModel(
                R.drawable.black_widow,
                R.string.blackWidowTitle,
                R.string.blackWidowReleaseDate,
                R.string.blackWidowDetails
            ),

            MovieModel(
                R.drawable.f9,
                R.string.f9Title,
                R.string.f9Date,
                R.string.f9Details
            ),

            MovieModel(
                R.drawable.infinite,
                R.string.infiniteTitle,
                R.string.infiniteDate,
                R.string.infiniteDetails
            ),

            MovieModel(
                R.drawable.cruella,
                R.string.cruellaTitle,
                R.string.cruellaReleaseDate,
                R.string.cruellaDetails
            ),

            MovieModel(
                R.drawable.luca,
                R.string.lucaTitle,
                R.string.lucaDate,
                R.string.lucaDetails
            ),

            MovieModel(
                R.drawable.oceans,
                R.string.oceansTitle,
                R.string.oceansReleaseDate,
                R.string.oceansDetails
            ),

            MovieModel(
                R.drawable.kingsman,
                R.string.kingsMenTitle,
                R.string.kingsMenReleaseDate,
                R.string.kingsMenDetails
            ),

            MovieModel(
                R.drawable.raya_and_last_dragon,
                R.string.rayaAndDragonTitle,
                R.string.rayaAndDragonReleaseDate,
                R.string.rayaAndDragonDetails
            ),
        )
    }

}