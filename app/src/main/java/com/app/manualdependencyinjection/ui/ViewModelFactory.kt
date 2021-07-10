package com.app.manualdependencyinjection.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.manualdependencyinjection.data.UserRepository

class ViewModelFactory(
    private val repository: UserRepository
) : ViewModelProvider.Factory    {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }
}