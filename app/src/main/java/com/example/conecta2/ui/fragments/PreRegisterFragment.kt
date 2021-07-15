package com.example.conecta2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.conecta2.R
import com.example.conecta2.databinding.FragmentPreRegisterBinding

class PreRegisterFragment : Fragment() {

    private lateinit var _binding: FragmentPreRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPreRegisterBinding.inflate(inflater, container, false)

        _binding.preRegisterButton.setOnClickListener {
            toAccountVerifiedFragment()
        }

        _binding.alreadyHaveAnAccountPreRegister.setOnClickListener {
            toLoginFragment()
        }

        return _binding.root
    }

    private fun toAccountVerifiedFragment() {
        findNavController().navigate(R.id.action_preRegisterFragment_to_accountVerifiedFragment)
    }

    private fun toLoginFragment() {
        findNavController().navigate(R.id.action_preRegisterFragment_to_loginFragment)
    }
}