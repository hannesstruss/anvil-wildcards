package com.example.anvilplayground.featuredagger

import com.anvilplayground.screen.FeatureScope
import com.anvilplayground.screen.ScreenPresentationModule
import dagger.Subcomponent

@FeatureScope
@Subcomponent(
    modules = [
        ScreenPresentationModule::class,
    ]
)
interface DaggerFeatureComponent {
    fun inject(myAnvilFeatureScreen: MyDaggerFeatureScreen)

    @Subcomponent.Factory
    interface Factory {
        fun create(): DaggerFeatureComponent
    }
}