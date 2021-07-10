package com.app.manualdependencyinjection

import android.app.Application
import com.app.manualdependencyinjection.container.AppContainer

class MyApplication : Application() {

    companion object{
        val appContainer: AppContainer = AppContainer()
    }

}