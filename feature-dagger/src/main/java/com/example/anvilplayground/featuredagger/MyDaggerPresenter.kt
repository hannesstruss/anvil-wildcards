package com.example.anvilplayground.featuredagger

import com.anvilplayground.screen.FeatureScope
import com.anvilplayground.screen.MyThing
import javax.inject.Inject

@FeatureScope
class MyDaggerPresenter @Inject constructor(
    private val getThing: () -> MyThing
)