package com.appsv.viewsproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.coroutines.cancellation.CancellationException

class FirstFragment : Fragment() {

    // Called when the fragment is first created
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAGVIRAJ", "onAttach called")
    }

    // Called to create the view hierarchy for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TAGVIRAJ", "onCreateView called")

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val handler = CoroutineExceptionHandler { _, exception ->
            Log.d("TAGVIRAJ", "CoroutineExceptionHandler got $exception")
        }

        // Using lifecycleScope
        this.lifecycleScope.launch(handler) {
            try {
                Log.d("TAGVIRAJ", "LSCOPE: LifecycleOwner.lifecycleScope started")
                delay(10000)
                Log.d("TAGVIRAJ", "LSCOPE: LifecycleOwner.lifecycleScope completed")
            } catch (e: CancellationException) {
                Log.d("TAGVIRAJ", "LSCOPE: lifecycleScope cancelled: $e")
            }
        }

        // Using viewLifecycleOwner.lifecycleScope
        this.viewLifecycleOwner.lifecycleScope.launch(handler) {
            try {
                Log.d("TAGVIRAJ", "LSCOPE: viewLifecycleOwner.lifecycleScope started")
                delay(10000)
                Log.d("TAGVIRAJ", "LSCOPE: viewLifecycleOwner.lifecycleScope completed")
            } catch (e: CancellationException) {
                Log.d("TAGVIRAJ", "LSCOPE: viewLifecycleOwner.lifecycleScope cancelled: $e")
            }
        }

        view.findViewById<Button>(R.id.buttonGo).setOnClickListener {
            // Navigate to SecondFragment using NavController
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        return view
    }

    // Called when the fragment's view hierarchy has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAGVIRAJ", "onViewCreated called")
    }

    // Called when the fragment is visible to the user
    override fun onStart() {
        super.onStart()
        Log.d("TAGVIRAJ", "onStart called")
    }

    // Called when the fragment is no longer visible to the user
    override fun onStop() {
        super.onStop()
        Log.d("TAGVIRAJ", "onStop called")
    }

    // Called when the fragment is no longer visible to the user and its view has been destroyed
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAGVIRAJ", "onDestroyView called")
    }

    // Called when the fragment itself is being destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGVIRAJ", "onDestroy called")
    }

    // Called when the fragment is no longer attached to its activity
    override fun onDetach() {
        super.onDetach()
        Log.d("TAGVIRAJ", "onDetach called")
    }
}
