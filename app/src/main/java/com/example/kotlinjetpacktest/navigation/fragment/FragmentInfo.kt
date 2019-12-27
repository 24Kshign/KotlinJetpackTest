package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinjetpacktest.R

class FragmentInfo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG","FragmentInfo-------->onCreateView")
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentInfo-------->onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentInfo-------->onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentInfo-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentInfo-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentInfo-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentInfo-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentInfo-------->onDetach")
    }
}