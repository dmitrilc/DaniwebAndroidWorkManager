package com.example.daniwebandroidworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManager = WorkManager.getInstance(applicationContext)
        val oneTimeDownloadWorkRequest = OneTimeWorkRequest.from(DownloadWorker::class.java)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val operation = workManager.enqueue(oneTimeDownloadWorkRequest)
        }
    }
}