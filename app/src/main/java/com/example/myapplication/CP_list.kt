package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityCpListBinding
import com.example.myapplication.databinding.ActivityDashboardBinding

class CP_list : AppCompatActivity() {

    private lateinit var binding: ActivityCpListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityCpListBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.cpContestid.setOnClickListener {
         val coreIntent = Intent(this, CP_contest::class.java)
         startActivity(coreIntent)
     }
        binding.cpSheetid.setOnClickListener {
            webviewcp("https://codeforces.com/group/MWSDmqGSzm/contests")
        }

    binding.cpYoutubeid.setOnClickListener {
        webviewcp("https://www.youtube.com/watch?v=OMcxQ3IY-qc&list=PLauivoElc3ggagradg8MfOZreCMmXMmJ-")
    }
    }
    private fun webviewcp(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("cpsheet", url)
        startActivity(intent)

    }
}