package ai.doubletapp.sample.navigation.navigationimpl.navigationapis

import ai.doubletapp.sample.navigation.feature3.Feature3FragmentDirections
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3Directions
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import androidx.navigation.NavController
import javax.inject.Inject

internal class Feature3NavigationApi @Inject constructor(
    private val navController: NavController,
): NavigationApi<Feature3Directions> {

    override fun navigate(direction: Feature3Directions) {
        when (direction) {
            Feature3Directions.ToFeature1 -> {
                navController.navigate(
                    Feature3FragmentDirections.fromFeature3ToFeature1()
                )
            }
            Feature3Directions.Up -> {
                navController.navigateUp()
            }
        }
    }
}
