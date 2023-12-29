package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDashboardBinding
import com.example.myapplication.databinding.ActivitySigninBinding

class dashboard : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.DSid.setOnClickListener {

            val DSintent = Intent(this, DS::class.java)
            startActivity(DSintent)
        }
        binding.algoid.setOnClickListener {

            dashboardwebview( "https://www.geeksforgeeks.org/most-important-type-of-algorithms/")
        }
        binding.coreid.setOnClickListener {

            val coreIntent = Intent(this, core_subject_list::class.java)
            startActivity(coreIntent)
        }
        binding.CPid.setOnClickListener {

            val CPIntent = Intent(this, CP_list::class.java)
            startActivity(CPIntent)
        }
        binding.placementid.setOnClickListener {

            val placementIntent = Intent(this, placement_list::class.java)
            startActivity(placementIntent)
        }
        binding.projectideaid.setOnClickListener {

            val projectIntent = Intent(this, project_list ::class.java)
            startActivity(projectIntent)
        }
    }
    private fun dashboardwebview(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("dashboard_list", url)
        startActivity(intent)

    }
}