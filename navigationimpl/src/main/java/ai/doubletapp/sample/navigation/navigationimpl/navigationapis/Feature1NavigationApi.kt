package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature1.Feature1FragmentDirections
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import androidx.navigation.NavController
import javax.inject.Inject

internal class Feature1NavigationApi @Inject constructor(
    private val navController: NavController,
): NavigationApi<Feature1Directions> {

    override fun navigate(direction: Feature1Directions) {
        when (direction) {
            Feature1Directions.ToFeature2 -> {
                navController.navigate(
                    Feature1FragmentDirections.fromFeature1ToFeature2()
                )
            }
        }
    }
}
