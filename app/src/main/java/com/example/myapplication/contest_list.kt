package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityContestListBinding
import com.example.myapplication.databinding.ActivityTheoryDetailsBinding

class contest_list : AppCompatActivity() {

    private lateinit var binding: ActivityContestListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityContestListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gfgid.setOnClickListener {

            openWebView( "https://practice.geeksforgeeks.org/events")
        }
        binding.leetcodeid.setOnClickListener {
            openWebView( "https://leetcode.com/contest/")
        }

        binding.cnid.setOnClickListener {
            openWebView( "https://www.codingninjas.com/studio/contests")
        }


    }
    private fun openWebView(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("contest_list", url)
        startActivity(intent)

    }
}