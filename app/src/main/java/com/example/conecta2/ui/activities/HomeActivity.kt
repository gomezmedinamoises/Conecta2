package com.example.conecta2.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.conecta2.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val menu: ImageView = findViewById<ImageView>(R.id.menu)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_view)

        menu.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this@HomeActivity, R.style.BottomSheetDialogTheme)
            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.component_bottom_sheet,
                findViewById<ConstraintLayout>(R.id.bottom_sheet)
            )

            bottomSheetView.findViewById<TextView>(R.id.logout_bottom_sheet_text).setOnClickListener {
                goToExternalActivity()
            }

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()
        }

        val navController = findNavController(R.id.home_container_view)
        bottomNavigationView.setupWithNavController(navController)
    }

    private fun goToRechargeFragment() {

    }

    private fun goToContactFragment() {

    }

    private fun goToPortabilityFragment() {

    }

    private fun goToExternalActivity() {
        val intent = Intent(this, ExternalActivity::class.java)
        startActivity(intent)
        finish()
    }
}