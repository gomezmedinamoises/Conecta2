package com.example.conecta2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conecta2.databinding.FragmentRechargeBinding

class RechargeFragment : Fragment() {

    private lateinit var _binding: FragmentRechargeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRechargeBinding.inflate(inflater, container, false)



        return _binding.root
    }
}