package com.example.kotlinjetpacktest.viewmodel.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinjetpacktest.R
import com.example.kotlinjetpacktest.viewmodel.viewmodel.CountViewModel
import kotlinx.android.synthetic.main.fragment_viewmodel.*

class FragmentViewModelTest : Fragment() {

    private lateinit var countViewModel: CountViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_viewmodel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fv_add_btn.visibility = View.GONE
        countViewModel = ViewModelProvider(activity!!).get(CountViewModel::class.java)
        countViewModel.count.observe(activity!!, Observer<Int> {
            fv_text_tv.text = "count = $it"
        })
    }
}