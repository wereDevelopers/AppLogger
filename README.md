# AppLogger

[![Jitpack](https://jitpack.io/v/wereDevelopers/AppLogger.svg)](https://jitpack.io/#wereDevelopers/AppLogger)
[![API](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=23)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/wereDevelopers/AppLogger/blob/main/LICENSE)

AppLogger simplifies the logging process by integrating with Timber and AndroidRemoteDebugger libraries and centralize its usage

## How to implement:

add in the Gradle
```groovy
dependencies {
    implementation('com.github.wereDevelopers:AppLogger:{LastTag}')
}
```

## How to use:

In Application call Applogger.Init()
```groovy
class ApplicationImpl : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            AppLogger.init(applicationContext, false)
        }
    }
}
```

To log a message call
```groovy
    AppLogger.d("example debug log")
    AppLogger.e("example error log")
    AppLogger.i("example %s %s", "info", "log")
```
