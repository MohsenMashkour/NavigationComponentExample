package com.mkrdeveloper.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation


class FirstFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)


        val tvFragment1 = view.findViewById<TextView>(R.id.tvFragment1)

        val etFragment1 = view.findViewById<EditText>(R.id.etFragment1)

        tvFragment1.setOnClickListener {
            val data = etFragment1.text

            val action = FirstFragmentDirections.goFromFirstFragmentToSecondFragment("$data")
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }


}