package com.app.manualdependencyinjection.data

class UserRepository(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
){

    fun getUserData(){
        // this will contain the logic to return user data
    }
}