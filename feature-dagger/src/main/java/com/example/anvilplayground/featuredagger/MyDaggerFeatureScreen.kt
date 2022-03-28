package com.example.anvilplayground.featuredagger

import javax.inject.Inject

class MyDaggerFeatureScreen {
    @Inject
    lateinit var presenter: MyDaggerPresenter
}