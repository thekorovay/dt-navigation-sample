package ai.doubletapp.sample.navigation.feature2.navigation

import ai.doubletapp.sample.navigation.feature2.Feature2To3Args
import ai.doubletapp.sample.navigation.feature2.databinding.FragmentFeature2Binding
import ai.doubletapp.sample.navigation.feature2.di.Feature2Injector
import ai.doubletapp.sample.navigation.navigationapi.NavigationApi
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject

class Feature2Fragment : Fragment() {

    private lateinit var binding: FragmentFeature2Binding

    @Inject
    lateinit var navigationApi: NavigationApi<Feature2Directions>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature2Binding.inflate(inflater, container, false)
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        (context as Feature2Injector)
            .injectFeature2Fragment(this)
        super.onAttach(context)
    }

    private fun setClickListeners() {
        binding.run {
            buttonToFeature3.setOnClickListener {
                navigationApi.navigate(Feature2Directions.ToFeature3(getFeature2To3Args()))
            }
            buttonBack.setOnClickListener {
                navigationApi.navigate(Feature2Directions.Up)
            }
        }
    }

    private fun getFeature2To3Args(): Feature2To3Args = Feature2To3Args(
        someArg1 = 2,
        someArg2 = "Previous Feature Number",
    )
}
