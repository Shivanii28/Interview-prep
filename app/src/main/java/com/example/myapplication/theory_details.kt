package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.webkit.WebViewClient
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.myapplication.databinding.ActivitySigninBinding
import com.example.myapplication.databinding.ActivityTheoryDetailsBinding

class theory_details : AppCompatActivity() {


    private lateinit var binding: ActivityTheoryDetailsBinding
    private lateinit var webView: web_View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityTheoryDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.basicid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/1XZCJiq2wbQJ7XcaBG2qRYdHiy3CpIeh7/view")
          }
        binding.arrayid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/14n7j_OcFUjHHe_fMDDya_K89mt7kp9Xy/view")
          }
        binding.stringid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/1-ain_-Ar4pKkgV70rGamQid2IqQ5lxdu/view")
           }
        binding.pointerid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/11oMBKPP1R8erT21gDzIvVa-CIF3aSI8R/view")
           }
        binding.DMAid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/19LPhcHxJ2EcMto2aWpRlTm-cmDO8sC-c/view")
           }
        binding.stlid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/1P7TYvXv1JnyDHX-42QfIy9ikKk9mUm9M/view")
           }
        binding.serachingid.setOnClickListener {
            openWebView("https://drive.google.com/file/d/1ytX0DS9G-xJA50VuJxWhmtalcABhwfkn/view")
           }

        binding.recursionid.setOnClickListener {
              openWebView("https://drive.google.com/file/d/1kuPP_QrSQRFjMFFUREzIMJDcatGmYTZQ/view")
            }
        binding.backtrackingid.setOnClickListener {
              openWebView("https://drive.google.com/file/d/1zUYCaJrSFlNxJ-ElaQeFCZ-6e9zd7Wjj/view")
            }
        binding.LLid.setOnClickListener {
              openWebView( "https://drive.google.com/file/d/1BzFWnaonDnwjrwCcP4P4Fn_3qmipB_UT/view")
            }

          binding.stackid.setOnClickListener {
              openWebView( "https://drive.google.com/file/d/17tlTdmfTe2fYUB57VLyMMxlRf1mZyBRx/view")

            }

          binding.queueid.setOnClickListener {
              openWebView("https://drive.google.com/file/d/1S4VZG-ug_obT3SN7FKO_9JB5xn54lvic/view")

           }

           binding.BTid.setOnClickListener {
               openWebView("https://drive.google.com/file/d/1evZHsVLWEYLEVAJIV_qIlR-927nXy3Xf/view")

           }
           binding.dpid.setOnClickListener {
               openWebView("https://drive.google.com/file/d/1Uj7g29KqQ9gbPT2qMF2AoF5Z_M2h-AF8/view")
           }
          binding.graphid.setOnClickListener {
               openWebView("https://drive.google.com/file/d/1Ar0hgmUNPMPSzfTgsAfcPOO4nPMBJGJg/view")
         }
        binding.greedyid.setOnClickListener {
               openWebView( "https://drive.google.com/file/d/1YWoh-wEmCXSSr4fP0X-wF1kwGmKdL3QG/view")
         }
    }

    private fun openWebView(url: String) {
        val intent = Intent(this, web_View::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}










