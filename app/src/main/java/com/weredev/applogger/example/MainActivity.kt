package com.weredev.applogger.example

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.weredev.applogger.AppLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppLogger.d("example debug log")
        AppLogger.e("example error log")
        AppLogger.i("example %s %s", "info", "log")
    }
}