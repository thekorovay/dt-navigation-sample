package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.navigationimpl.NavigationActivityProvider
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [AppModule::class],
)
internal interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance activityProvider: NavigationActivityProvider,
        ): AppComponent
    }
}
