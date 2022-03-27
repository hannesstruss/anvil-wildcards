package com.example.anvilplayground.featuredagger

import com.anvilplayground.screen.MyContext
import javax.inject.Inject

class MyDaggerFeatureScreen {
    @Inject
    lateinit var contextGetter: () -> MyContext
}