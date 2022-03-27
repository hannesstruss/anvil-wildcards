package com.anvilplayground.featureanvil

import com.anvilplayground.screen.MyContext
import javax.inject.Inject

class MyAnvilFeatureScreen {
    @Inject
    lateinit var contextGetter: () -> MyContext
}