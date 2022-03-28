package com.anvilplayground.featureanvil

import com.anvilplayground.screen.FeatureScope
import com.anvilplayground.screen.MyThing
import javax.inject.Inject

@FeatureScope
class MyAnvilPresenter @Inject constructor(
    private val getThing: () -> MyThing
)