package com.example.conecta2.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.conecta2.databinding.ActivityExternalBinding

class ExternalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExternalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExternalBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun setLoadingVisibility(shouldShowLoading: Boolean) {
        binding.loadingView.visibility = if (shouldShowLoading) View.VISIBLE else View.GONE
    }
}