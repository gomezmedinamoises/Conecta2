package com.example.conecta2.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conecta2.databinding.FragmentAccountCreatedBinding
import com.example.conecta2.ui.activities.HomeActivity

class AccountCreatedFragment : Fragment() {

    private lateinit var _binding: FragmentAccountCreatedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAccountCreatedBinding.inflate(inflater, container, false)

        _binding.continueButton.setOnClickListener {
            goToHomeActivity()
        }

        return _binding.root
    }

    private fun goToHomeActivity() {
        val intent = Intent(context, HomeActivity::class.java)
        startActivity(intent)
    }
}