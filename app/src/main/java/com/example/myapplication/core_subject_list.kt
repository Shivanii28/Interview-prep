package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCoreSubjectListBinding
import com.example.myapplication.databinding.ActivityPlaylistListBinding

class core_subject_list : AppCompatActivity() {

    private lateinit var binding: ActivityCoreSubjectListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoreSubjectListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dbmsid.setOnClickListener {

            core_subject_webview("https://www.guru99.com/dbms-tutorial.html")

        }
        binding.CNid.setOnClickListener {

            core_subject_webview(" https://www.geeksforgeeks.org/basics-computer-networking/?ref=lbp")

        }
        binding.oopsid.setOnClickListener {
            core_subject_webview(" https://www.geeksforgeeks.org/object-oriented-programming-in-cpp/")
        }
        binding.osid.setOnClickListener {
            core_subject_webview(" https://www.geeksforgeeks.org/operating-systems/?ref=lbp")
        }

    }
    private fun core_subject_webview(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("coresubject", url)
        startActivity(intent)
    }
}