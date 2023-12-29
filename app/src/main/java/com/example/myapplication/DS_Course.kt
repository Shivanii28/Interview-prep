package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDsBinding
import com.example.myapplication.databinding.ActivityDsCourseBinding
import com.example.myapplication.databinding.ActivityTheoryDetailsBinding

class DS_Course : AppCompatActivity() {

    private lateinit var binding: ActivityDsCourseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityDsCourseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.theoryid.setOnClickListener {

            val theoryintent = Intent(this, theory_details::class.java)
            startActivity(theoryintent)

        }
        binding.interviewqueid.setOnClickListener {

            val intent = Intent(this, web_View::class.java)
            intent.putExtra(
                "interviewexp",
                "https://www.geeksforgeeks.org/interview-preparation-for-software-developer/"
            )
            startActivity(intent)
        }
        binding.playlistid.setOnClickListener {
            val intent = Intent(this, playlist_list::class.java)
            startActivity(intent)
        }
        }

    }
