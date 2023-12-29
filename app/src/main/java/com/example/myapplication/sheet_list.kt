package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityContestListBinding
import com.example.myapplication.databinding.ActivitySheetListBinding

class sheet_list : AppCompatActivity() {

    private lateinit var binding: ActivitySheetListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySheetListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gfgi.setOnClickListener {

            sheetWebView( "https://www.geeksforgeeks.org/sde-sheet-a-complete-guide-for-sde-preparation/#DSA")
        }
        binding.striverid.setOnClickListener{
            sheetWebView( "https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems/")
        }
        binding.LBid.setOnClickListener{
            sheetWebView( "https://450dsa.com/")
        }
        binding.ACid.setOnClickListener{
            sheetWebView( "https://docs.google.com/spreadsheets/d/1hXserPuxVoWMG9Hs7y8wVdRCJTcj3xMBAEYUOXQ5Xag/edit#gid=0")
        }
        binding.sdesheetid.setOnClickListener{
            sheetWebView( "https://www.geeksforgeeks.org/sde-sheet-a-complete-guide-for-sde-preparation/")
        }
        binding.sderoadmapid.setOnClickListener{
            sheetWebView( "https://www.youtube.com/watch?v=ayZppqJAUcc")
        }
    }
    private fun sheetWebView(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("sheet_list", url)
        startActivity(intent)

    }
}