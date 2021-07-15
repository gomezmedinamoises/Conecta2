package com.example.conecta2.commons

import androidx.fragment.app.Fragment
import com.example.conecta2.ui.activities.ExternalActivity

open class BaseFragment : Fragment() {

    fun showLoading(show: Boolean) = (requireActivity() as ExternalActivity).setLoadingVisibility(true)

}