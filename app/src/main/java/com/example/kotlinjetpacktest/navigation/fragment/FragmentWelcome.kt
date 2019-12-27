package com.example.kotlinjetpacktest.navigation.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kotlinjetpacktest.R
import kotlinx.android.synthetic.main.fragment_welcome.*

class FragmentWelcome : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG","FragmentWelcome-------->onViewCreated")
        to_login.setOnClickListener {
            // 切换到下一个fragment
            Navigation.findNavController(it).navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        to_register.setOnClickListener {
            // 切换到下一个fragment，并传参数
            val bundle = Bundle()
            bundle.putString("test", "来自欢迎页面")
            Navigation.findNavController(it)
                .navigate(R.id.action_welcomeFragment_to_registerFragment, bundle)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("TAG","FragmentWelcome-------->onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG","FragmentWelcome-------->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG","FragmentWelcome-------->onResume")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG","FragmentWelcome-------->onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG","FragmentWelcome-------->onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG","FragmentWelcome-------->onDetach")
    }
}