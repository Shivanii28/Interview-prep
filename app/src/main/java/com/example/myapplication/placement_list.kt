package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDashboardBinding
import com.example.myapplication.databinding.ActivityPlacementListBinding

class placement_list : AppCompatActivity() {
    private lateinit var binding: ActivityPlacementListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityPlacementListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cWiseid.setOnClickListener {

            placmentview("https://practice.geeksforgeeks.org/explore?page=1&curated[]=1&sortBy=submissions&curated_names[]=SDE%20Sheet")
        }
        binding.tWiseid.setOnClickListener {

            placmentview("https://www.geeksforgeeks.org/placements-gq/")
        }
        binding.mostaskid.setOnClickListener {

            placmentview("https://in.indeed.com/career-advice/interviewing/top-interview-questions-and-answers")
        }
        binding.interviewexpid.setOnClickListener {

            placmentview("https://www.geeksforgeeks.org/category/experiences/interview-experiences/")
        }
    }
    private fun placmentview(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("placement_list", url)
        startActivity(intent)

    }
}