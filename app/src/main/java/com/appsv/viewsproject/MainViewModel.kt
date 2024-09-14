package com.appsv.viewsproject

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val viewModelJob = SupervisorJob()
    private val viewModelScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    fun fetchData() {

        viewModelScope.launch {
            delay(5000) // Simulate a long-running task
            // Do something after the delay
        }
    }

    // This method is called when the ViewModel is destroyed
    override fun onCleared() {
        super.onCleared()
        // Cancel the coroutine job to avoid memory leaks
        Log.d("TAGVIRAJ", "Viewmodel called 1")
        viewModelJob.cancel()
    }
}
class MainViewModel1 : ViewModel() {
    private val viewModelJob = SupervisorJob()
    private val viewModelScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    fun fetchData() {

        viewModelScope.launch {
            delay(5000) // Simulate a long-running task
            // Do something after the delay
        }
    }

    // This method is called when the ViewModel is destroyed
    override fun onCleared() {
        super.onCleared()
        // Cancel the coroutine job to avoid memory leaks
        Log.d("TAGVIRAJ", "Viewmodel called 2")
        viewModelJob.cancel()
    }
}