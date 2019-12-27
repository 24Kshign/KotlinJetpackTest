package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kotlinjetpacktest.R

class FragmentRegister : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentRegister-------->onViewCreated")
        //获取上个fragment带过来的参数
        val test = arguments?.getString("test")
        if (!test.isNullOrEmpty()) {
            Toast.makeText(context, test, Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentRegister-------->onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentRegister-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentRegister-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentRegister-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentRegister-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentRegister-------->onDetach")
    }
}