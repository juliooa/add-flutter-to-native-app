package com.julioandres.addtoapptestandroid

import android.app.Application
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()

        val engine = FlutterEngine(this);

        engine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )

        FlutterEngineCache.getInstance()
            .put("mi_engine", engine);
    }
}