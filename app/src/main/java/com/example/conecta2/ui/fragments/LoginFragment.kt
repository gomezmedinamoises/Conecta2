package com.example.conecta2.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.conecta2.R
import com.example.conecta2.commons.BaseFragment
import com.example.conecta2.databinding.FragmentLoginBinding
import com.example.conecta2.ui.activities.HomeActivity
import com.example.conecta2.viewmodel.LoginViewModel


class LoginFragment : BaseFragment() {

    private lateinit var _binding: FragmentLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        _binding.loginButton.setOnClickListener {
            toHomeActivity()
        }

        _binding.dontHaveAnAccount.setOnClickListener {
            toPreRegisterFragment()
        }

        return _binding.root
    }

    /*private val loginUserObserver = Observer<DataResource<LoginUser>> {
        //TODO //toHomeActivity()
        when(it) {
        DataR}
    }*/

    private fun toHomeActivity() {
        val intent = Intent(context, HomeActivity::class.java)
        startActivity(intent)
    }

    private fun toPreRegisterFragment() {
        findNavController().navigate(R.id.action_loginFragment_to_preRegisterFragment)
    }

}