package com.app.manualdependencyinjection.container

import androidx.activity.viewModels
import com.app.manualdependencyinjection.MyApplication
import com.app.manualdependencyinjection.data.UserLocalDataSource
import com.app.manualdependencyinjection.data.UserRemoteDataSource
import com.app.manualdependencyinjection.data.UserRepository
import com.app.manualdependencyinjection.ui.LoginViewModel
import com.app.manualdependencyinjection.ui.ViewModelFactory

class AppContainer {

    /**
     * This is MANUAL DEPENDENCY INJECTION
     * and the preferred way is to use DAGGER2 for Dependency Injection so to overcome this manual creation of containers.
     */

    /**
     * This container will serve the repository and the respective viewmodel so if the same viewmodel is required or
     * the same repository is required throughout the app, then we dont need to recreate the instance
     *
     * we could also create singleton but it makes heptic for testing..
     * Having the Dependency injection is preferable for scalability of the app
     * as the app will grow with new features.
     */
    private val localDataSource: UserLocalDataSource = UserLocalDataSource()
    private val remoteDataSource: UserRemoteDataSource = UserRemoteDataSource()

    private val userRepository = UserRepository(localDataSource = localDataSource, remoteDataSource = remoteDataSource )

    val loginViewModelFactory = ViewModelFactory(userRepository)

}