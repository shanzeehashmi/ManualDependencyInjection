package com.app.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.app.manualdependencyinjection.ui.LoginViewModel

class MainActivity : AppCompatActivity() {

    private val appContainer = MyApplication.appContainer
    private lateinit var textView:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel =  ViewModelProvider(this, appContainer.loginViewModelFactory).get(LoginViewModel::class.java)

        textView = findViewById<TextView>(R.id.textView)
        textView.text = viewModel.getUserInfo().toString()


    }
}