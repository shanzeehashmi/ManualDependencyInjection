package com.app.manualdependencyinjection.data

class UserRepository(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
) {

    private val time = System.currentTimeMillis()

    fun getUserData(): Long {
        // this will contain the logic to return user data

        return time
    }
}