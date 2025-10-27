package com.shepherd.browser

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import org.mozilla.geckoview.GeckoRuntime
import org.mozilla.geckoview.GeckoSession
import org.mozilla.geckoview.GeckoView

class MainActivity : AppCompatActivity() {
    private lateinit var geckoView: GeckoView
    private val session = GeckoSession()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        geckoView = findViewById(R.id.gecko_view)
        val urlBar: EditText = findViewById(R.id.url_bar)
        val goButton: Button = findViewById(R.id.go_button)

        // Create and open Gecko runtime/session
        val runtime = GeckoRuntime.create(this)
        session.open(runtime)
        geckoView.setSession(session)

        // Load a default page
        session.loadUri("https://mozilla.org")

        goButton.setOnClickListener {
            var uri = urlBar.text.toString().trim()
            if (!uri.startsWith("http")) {
                uri = "https://$uri"
            }
            session.loadUri(uri)
        }
    }

    override fun onDestroy() {
        session.close()
        super.onDestroy()
    }
}