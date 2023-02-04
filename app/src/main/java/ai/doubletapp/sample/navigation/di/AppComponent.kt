package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.feature1.Feature1Fragment
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Fragment
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.di.NavigationModule
import dagger.Component

@Component(
    modules = [NavigationModule::class]
)
interface AppComponent {

    val feature1NavigationApi: NavigationApi<Feature1Directions>

    val feature2NavigationApi: NavigationApi<Feature2Directions>

    fun injectFeature1Fragment(fragment: Feature1Fragment)

    fun injectFeature2Fragment(fragment: Feature2Fragment)

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }
}
