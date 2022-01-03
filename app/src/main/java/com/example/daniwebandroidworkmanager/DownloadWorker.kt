package com.example.daniwebandroidworkmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class DownloadWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        Thread.sleep(1_000L)

        return Result.success()
    }

}