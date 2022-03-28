package com.example.anvilplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerAppComponent.create()
        component.anvilFeatureComponent()
        component.daggerFeatureComponent()
    }
}
