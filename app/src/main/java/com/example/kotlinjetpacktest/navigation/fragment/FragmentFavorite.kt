package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinjetpacktest.R

class FragmentFavorite : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","FragmentFavorite-------->onCreateView")
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentFavorite-------->onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentFavorite-------->onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentFavorite-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentFavorite-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentFavorite-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentFavorite-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentFavorite-------->onDetach")
    }
}