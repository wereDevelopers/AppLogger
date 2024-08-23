package com.weredev.applogger.example

import android.app.Application
import com.weredev.applogger.AppLogger

/**
 * Custom implementation of the [Application] class for initializing global application state.
 * <p>
 * This class is used to initialize the [AppLogger] during the application's startup,
 * but only in debug builds. The logger is set up to use the application context, and
 * remote debugging is disabled by default.
 * </p>
 */
class ApplicationImpl : Application() {

    /**
     * Called when the application is starting, before any other application objects have been created.
     * <p>
     * In this implementation, the [AppLogger] is initialized when the app is in debug mode.
     * </p>
     */
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            AppLogger.init(applicationContext, false)
        }
    }
}