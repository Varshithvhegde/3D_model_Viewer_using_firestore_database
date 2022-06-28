package com.example.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.ar.sceneform.ux.ArFragment

class arfragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arfragment)
        var message: String? = intent.getStringExtra("message_key")
        (supportFragmentManager.findFragmentById(R.id.arFragment) as ArFragment)
            .setOnTapPlaneGlbModel(message)
    }
}