package com.julioandres.addtoapptestandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.julioandres.addtoapptestandroid.databinding.ActivityMainBinding
import io.flutter.embedding.android.FlutterActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.buttonFirst.setOnClickListener {
            startActivity(FlutterActivity.createDefaultIntent(this))
        }
    }
}