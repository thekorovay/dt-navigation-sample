package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature2.navigation.Feature2Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import javax.inject.Inject

class Feature2NavigationApi @Inject constructor(): NavigationApi<Feature2Directions> {

    override fun navigate(direction: Feature2Directions) {
        when (direction) {
            is Feature2Directions.ToFeature3 -> TODO()
            is Feature2Directions.Up -> TODO()
        }
    }
}
