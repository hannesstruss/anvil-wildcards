package com.example.anvilplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anvilplayground.featureanvil.MyAnvilFeatureScreen
import com.example.anvilplayground.featuredagger.MyDaggerFeatureScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerAppComponent.factory().create()

        val anvilFeatureScreen = MyAnvilFeatureScreen()
        component.anvilFeatureComponent().create().inject(anvilFeatureScreen)

        val daggerFeatureScreen = MyDaggerFeatureScreen()
        component.daggerFeatureComponent().create().inject(daggerFeatureScreen)
    }
}
