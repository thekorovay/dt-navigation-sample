package ai.doubletapp.sample.navigation.navigationimpl.di

import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.navigationapis.Feature1NavigationApi
import ai.doubletapp.sample.navigation.navigationimpl.navigationapis.Feature2NavigationApi
import dagger.Binds
import dagger.Module

@Module
interface NavigationModule {

    @Binds
    fun bindFeature1NavigationApi(api: Feature1NavigationApi): NavigationApi<Feature1Directions>

    @Binds
    fun bindFeature2NavigationApi(api: Feature2NavigationApi): NavigationApi<Feature2Directions>
}
