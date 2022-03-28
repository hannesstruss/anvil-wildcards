package com.anvilplayground.featureanvil

import javax.inject.Inject

class MyAnvilFeatureScreen {
    @Inject
    lateinit var presenter: MyAnvilPresenter
}