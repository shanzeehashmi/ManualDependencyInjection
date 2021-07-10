package com.app.manualdependencyinjection.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.app.manualdependencyinjection.data.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel() {


    fun getUserInfo(): Long {
        return userRepository.getUserData()
    }


    override fun onCleared() {
        super.onCleared()

        Log.i("zeeeeeee", "onCleared: the viewmodel is cleared")
    }
}