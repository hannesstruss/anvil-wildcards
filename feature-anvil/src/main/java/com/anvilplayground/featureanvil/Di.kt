package com.anvilplayground.featureanvil

import com.anvilplayground.screen.FeatureScope
import com.anvilplayground.screen.ScreenPresentationModule
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent

@FeatureScope
@MergeSubcomponent(
    scope = FeatureScope::class,
    modules = [
        ScreenPresentationModule::class,
    ]
)
interface AnvilFeatureComponent {
    fun inject(myAnvilFeatureScreen: MyAnvilFeatureScreen)

    @Subcomponent.Factory
    interface Factory {
        fun create(): AnvilFeatureComponent
    }
}