package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kotlinjetpacktest.R
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentLogin-------->onViewCreated")
        // 返回上一个fragment
        login_finish.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentLogin-------->onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentLogin-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentLogin-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentLogin-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentLogin-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentLogin-------->onDetach")
    }
}