package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDsBinding
import com.example.myapplication.databinding.ActivitySigninBinding
import com.example.myapplication.databinding.ActivityTheoryDetailsBinding
import com.google.firebase.auth.FirebaseAuth

class DS : AppCompatActivity() {

    private lateinit var binding: ActivityDsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding variable before using it
        binding = ActivityDsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.courseid.setOnClickListener {
            val courseintent = Intent(this, DS_Course::class.java)
            startActivity(courseintent)

        }
        binding.contestid.setOnClickListener {
            val courseintent = Intent(this, contest_list::class.java)
            startActivity(courseintent)
        }
        binding.sheetid.setOnClickListener {
            val courseintent = Intent(this, sheet_list::class.java)
            startActivity(courseintent)
        }
        binding.youtubeid.setOnClickListener {
            sheetWebView( " https://www.youtube.com/watch?v=WQoB2z67hvY&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA")

        }

    }
    private fun sheetWebView(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("youtube", url)
        startActivity(intent)

    }
}