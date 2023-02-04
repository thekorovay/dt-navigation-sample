package ai.doubletapp.sample.navigation

import ai.doubletapp.sample.navigation.di.AppComponent
import ai.doubletapp.sample.navigation.di.DaggerAppComponent
import ai.doubletapp.sample.navigation.feature1.Feature1Fragment
import ai.doubletapp.sample.navigation.feature1.di.Feature1Injector
import ai.doubletapp.sample.navigation.feature2.di.Feature2Injector
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Fragment
import android.app.Application

class MainApplication : Application(), Feature1Injector, Feature2Injector {

    private val appComponent: AppComponent = DaggerAppComponent.factory().create()

    override fun injectFeature1Fragment(fragment: Feature1Fragment) {
        appComponent.injectFeature1Fragment(fragment)
    }

    override fun injectFeature2Fragment(fragment: Feature2Fragment) {
        appComponent.injectFeature2Fragment(fragment)
    }
}
