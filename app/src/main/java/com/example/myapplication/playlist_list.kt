package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityDsCourseBinding
import com.example.myapplication.databinding.ActivityPlaylistListBinding

class playlist_list : AppCompatActivity() {
    private lateinit var binding: ActivityPlaylistListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaylistListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.basicid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=xLetJpcjHS0")
        }
        binding.arrayid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=Wdjr6uoZ0e0&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=24")
        }
        binding.stringid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=Wdjr6uoZ0e0&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=24")
        }
        binding.pointerid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=YHwEIfrXZgE&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=28")
        }
        binding.DMAid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=udfbq4M2Kfc")
        }
        binding.stlid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=R5BEcvTVZj0&list=PLauivoElc3gh3RCiQA82MDI-gJfXQQVnn")
        }
        binding.serachingid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=j7NodO9HIbk&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2")
        }
        binding.recursionid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=kHi1DUhp9kM&list=PL_z_8CaSLPWeT1ffjiImo0sYTcnLzo-wY")
        }
        binding.backtrackingid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=yVdKa8dnKiE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9")
        }
        binding.LLid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=q8gdBn9RPeI&t=6199s")
        }
        binding.stackid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=P1bAPZg5uaE&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd")
        }
        binding.queueid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=W7uB9-TKfTg&list=PLDzeHZWIZsTrhXYYtx4z8-u8zA-DzuVsj&index=7")
        }
        binding.BTid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=5NiXlPrLslg&list=PLDzeHZWIZsTo87y1ytEAqp7wYlEP3nner")
        }
        binding.dpid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=nqowUJzG-iM&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go")
        }
        binding.graphid.setOnClickListener {
            openWebView("https://www.youtube.com/watch?v=EaK6aslcC5g&list=PLDzeHZWIZsTobi35C3I-tKB3tRDX6YxuA")
        }
        binding.greedyid.setOnClickListener {
            openWebView( "https://www.youtube.com/watch?v=HZOUwKCKF5o&t=4665s")
        }
        binding.heapid.setOnClickListener {
            openWebView( "https://www.youtube.com/watch?v=hW8PrQrvMNc&list=PL_z_8CaSLPWdtY9W22VjnPxG30CXNZpI9")
        }
      }
    private fun openWebView(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("playlist", url)
        startActivity(intent)
    }
     }
