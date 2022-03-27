package com.anvilplayground.screen

import dagger.Module
import dagger.Provides

@Module
object ScreenPresentationModule {
    @Provides
    fun contextGetter(): () -> MyContext {
//    fun contextGetter(): () -> @JvmWildcard MyContext {
        return {
            MyContext()
        }
    }
}