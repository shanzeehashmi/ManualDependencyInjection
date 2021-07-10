package com.app.manualdependencyinjection.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.app.manualdependencyinjection.data.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    private val time = System.currentTimeMillis()

    fun getUserInfo(): Long {
        return time
    }


    override fun onCleared() {
        super.onCleared()

        Log.i("zeeeeeee", "onCleared: the viewmodel is cleared")
    }
}