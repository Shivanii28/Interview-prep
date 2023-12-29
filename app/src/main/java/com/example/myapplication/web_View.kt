package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.myapplication.databinding.ActivityWebViewBinding
import java.util.*

class web_View : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding
    private lateinit var urlQueue: Queue<String>
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webView = binding.webview
        val webView = findViewById<WebView>(R.id.webview)
        webView.settings.javaScriptEnabled = true
        webView.settings.builtInZoomControls = true
        urlQueue = LinkedList<String>()

        val url = intent.getStringExtra("url")
        if (!url.isNullOrEmpty()) {
            urlQueue.add(url)
        }

        val link = intent.getStringExtra("interviewexp")
        if (!link.isNullOrEmpty()) {
            urlQueue.add(link)
        }

        val playlisturl = intent.getStringExtra("playlist")
        if (!playlisturl.isNullOrEmpty()) {
            urlQueue.add(playlisturl)
        }

        val courselist = intent.getStringExtra("contest_list")
        if (!courselist.isNullOrEmpty()) {
            urlQueue.add(courselist)
        }

        val sheet = intent.getStringExtra("sheet_list")
        if (!sheet.isNullOrEmpty()) {
            urlQueue.add(sheet)
        }
        val youtubeid = intent.getStringExtra("youtube")
        if (!youtubeid.isNullOrEmpty()) {
            urlQueue.add(youtubeid)
        }

        val dashboradli = intent.getStringExtra("dashboard_list")
        if (!dashboradli.isNullOrEmpty()) {
            urlQueue.add(dashboradli)
        }

        val core = intent.getStringExtra("coresubject")
        if (!core.isNullOrEmpty()) {
            urlQueue.add(core)
        }

        val placement = intent.getStringExtra("placement_list")
        if (!placement.isNullOrEmpty()) {
            urlQueue.add(placement)
        }

        val project = intent.getStringExtra("project_list")
        if (!project.isNullOrEmpty()) {
            urlQueue.add(project)
        }

        val cp_contestlist = intent.getStringExtra("cp_contest")
        if (!cp_contestlist.isNullOrEmpty()) {
            urlQueue.add(cp_contestlist)
        }

        val cpsheet = intent.getStringExtra("cpsheet")
        if (!cpsheet.isNullOrEmpty()) {
            urlQueue.add(cpsheet)
        }
        loadNextUrl()

    }
    private fun loadNextUrl() {
        if (urlQueue.isEmpty()) {
            // All URLs have been loaded, do any necessary cleanup or display a message
            return
        }

        val nextUrl = urlQueue.poll()
        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                // The current URL has finished loading, load the next URL
                loadNextUrl()
            }
        }
        webView.loadUrl(nextUrl)

    }

}
