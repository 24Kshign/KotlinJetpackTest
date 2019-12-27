package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinjetpacktest.R

class FragmentMe : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","FragmentMe-------->onCreateView")
        return inflater.inflate(R.layout.fragment_me, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentMe-------->onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentMe-------->onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentMe-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentMe-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentMe-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentMe-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentMe-------->onDetach")
    }
}