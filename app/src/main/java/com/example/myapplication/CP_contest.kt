package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCpContestBinding
import com.example.myapplication.databinding.ActivityDashboardBinding

class CP_contest : AppCompatActivity() {

    private lateinit var binding: ActivityCpContestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityCpContestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.codechefid.setOnClickListener {

            cpwebview("https://www.codechef.com/practice")
        }

        binding.codeforceid.setOnClickListener {
            cpwebview("https://codeforces.com/contests")
        }
        binding.hackerrankid.setOnClickListener {
            cpwebview("https://www.hackerrank.com/dashboard")
        }
        binding.hackerearthid.setOnClickListener {
            cpwebview("https://www.hackerearth.com/challenges/competitive/")
        }
    }

    private fun cpwebview(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("cp_contest", url)
        startActivity(intent)

    }
}