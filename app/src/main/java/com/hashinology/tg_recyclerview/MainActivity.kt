package com.hashinology.tg_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.hashinology.tg_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        inittViews()
    }

    private fun inittViews() {
        setRVAdapter()
    }

    private fun setRVAdapter() {
        TODO("Not yet implemented")
    }
}