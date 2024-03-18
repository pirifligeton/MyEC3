package com.pirifligeton.appgrouphuaquisto

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter


class FormFragment : Fragment() {

    private lateinit var binding : FormFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_form, container, false)
    ArrayAdapter.createFromResource(
        android.app.Fragment, R.array.spinner1,android.R.layout.simple_spinner_item
    ).also {
        adapter ->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spin
    }
    }


}