package com.example.conecta2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.conecta2.R
import com.example.conecta2.databinding.FragmentAccountVerifiedBinding

class AccountVerifiedFragment : Fragment() {

    private lateinit var _binding: FragmentAccountVerifiedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAccountVerifiedBinding.inflate(inflater, container, false)

        _binding.resendMessage.setOnClickListener {
            goToRegisterFragment()
        }

        return _binding.root
    }

    private fun goToRegisterFragment() {
        findNavController().navigate(R.id.action_accountVerifiedFragment_to_registerFragment)
    }
}