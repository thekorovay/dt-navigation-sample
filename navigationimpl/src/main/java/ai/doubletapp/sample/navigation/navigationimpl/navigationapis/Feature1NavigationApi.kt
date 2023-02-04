package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import javax.inject.Inject

class Feature1NavigationApi @Inject constructor(): NavigationApi<Feature1Directions> {

    override fun navigate(direction: Feature1Directions) {
        when (direction) {
            Feature1Directions.ToFeature2 -> TODO()
        }
    }
}
