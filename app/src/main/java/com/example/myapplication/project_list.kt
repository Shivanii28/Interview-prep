package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDashboardBinding
import com.example.myapplication.databinding.ActivityProjectListBinding

class project_list : AppCompatActivity() {

    private lateinit var binding: ActivityProjectListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityProjectListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webid.setOnClickListener{

            projectview("https://www.interviewbit.com/blog/web-development-projects/")
        }

        binding.android.setOnClickListener {
            projectview("https://techvidvan.com/tutorials/android-project-ideas/")
        }

        binding.MLid.setOnClickListener {
            projectview("https://data-flair.training/blogs/machine-learning-project-ideas/")
        }

        binding.AIid.setOnClickListener {
            projectview("https://www.projectpro.io/article/artificial-intelligence-project-ideas/461")
        }

        binding.javaid.setOnClickListener {
            projectview("https://www.interviewbit.com/blog/java-projects/")
        }

        binding.pythonid.setOnClickListener {
            projectview("https://www.interviewbit.com/blog/python-projects/")
        }
    }

    private fun projectview(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("project_list", url)
        startActivity(intent)

    }
}