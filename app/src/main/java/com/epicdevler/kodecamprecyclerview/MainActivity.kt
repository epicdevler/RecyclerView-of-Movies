package com.epicdevler.kodecamprecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.epicdevler.kodecamprecyclerview.Adapters.MovieCyclerAdapter
import com.epicdevler.kodecamprecyclerview.DataSources.MoviesData
import com.epicdevler.kodecamprecyclerview.Models.MovieModel
import com.epicdevler.kodecamprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var moviesData : List<MovieModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        INITIALIZE VIEW BINDING
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        INITIALIZE MOVIES DATA
        initMoviesDataSource()

//        INITIALIZE RECYCLERVIEW
        initRecyclerView()

    }

    private fun initMoviesDataSource() {
        var moviesDataSource = MoviesData()

        moviesData = moviesDataSource.loadMovies()
    }

    private fun initRecyclerView() {

//        Initialize View Element
        val recyclerView : RecyclerView = binding.recyclerMovieView
        recyclerView.setHasFixedSize(true)

//        Set layoutManager using some RecyclerView LayoutManager Support Class
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

//        CHANGING RECYCLERVIEW LAYOUT MANAGER TYPE TO GridLayoutManager
        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

//        Set recyclerView Adapter
        recyclerView.adapter = MovieCyclerAdapter(this, moviesData)

    }

}