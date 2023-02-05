package ai.doubletapp.sample.navigation.navigationimpl.di

import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.NavigationActivityProvider
import ai.doubletapp.sample.navigation.navigationimpl.navigationapis.Feature1NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.navigationapis.Feature2NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.navigationapis.Feature3NavigationApi
import androidx.navigation.NavController
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(
    includes = [NavigationImplModule.Binder::class],
)
internal class NavigationImplModule {

    @Provides
    fun provideNavController(
        activityProvider: NavigationActivityProvider,
    ): NavController = activityProvider.get()
        ?.getNavigationFragment()
        ?.navController
        ?: error("Do not make navigation calls while activity is not available")

    @Module
    interface Binder {

        @Binds
        fun bindFeature1NavigationApi(api: Feature1NavigationApi): NavigationApi<Feature1Directions>

        @Binds
        fun bindFeature2NavigationApi(api: Feature2NavigationApi): NavigationApi<Feature2Directions>

        @Binds
        fun bindFeature3NavigationApi(api: Feature3NavigationApi): NavigationApi<Feature3Directions>
    }
}
