package com.example.anvilplayground

import com.anvilplayground.featureanvil.AnvilFeatureComponent
import com.example.anvilplayground.featuredagger.DaggerFeatureComponent
import com.squareup.anvil.annotations.MergeComponent
import dagger.Component
import javax.inject.Singleton

@MergeComponent(
    scope = Singleton::class,
)
interface AppComponent {
    fun anvilFeatureComponent(): AnvilFeatureComponent.Factory
    fun daggerFeatureComponent(): DaggerFeatureComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }
}