package com.anvilplayground.screen

import dagger.Module
import dagger.Provides

@Module
object MyThingModule {
    @Provides
//    fun provideGetThing(): () -> MyThing {
    fun provideGetThing(): () -> @JvmWildcard MyThing { // @JvmWildcard is needed for Dagger-generated factories.
        return {
            MyThing()
        }
    }
}