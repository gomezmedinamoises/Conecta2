package com.example.conecta2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.conecta2.R
import com.example.conecta2.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private lateinit var _binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)

        _binding.registerButton.setOnClickListener {
            goToAccountCreatedFragment()
        }

        _binding.alreadyHaveAnAccountRegister.setOnClickListener {
            goToLoginFragment()
        }

        return _binding.root
    }

    private fun goToAccountCreatedFragment() {
        findNavController().navigate(R.id.action_registerFragment_to_accountCreatedFragment)
    }

    private fun goToLoginFragment() {
        findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
    }
}