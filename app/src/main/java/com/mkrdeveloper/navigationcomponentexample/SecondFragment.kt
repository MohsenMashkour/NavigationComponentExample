package com.mkrdeveloper.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {

    val args : SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)


        val tvFragment2 = view.findViewById<TextView>(R.id.tvFragment2)
        val tvDataFragment2 = view.findViewById<TextView>(R.id.tvDataFragment2)


        tvDataFragment2.text = args.text

        tvFragment2.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.goFromSecondFragmentToFirstFragment)
        }

        return view
    }


}