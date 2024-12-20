package com.appsv.viewsproject

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {

    // Called when the fragment is first created
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TAGVIRAJ", "Fragment 2: onAttach called")
    }

    // Called to create the view hierarchy for this fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("TAGVIRAJ", "Fragment 2: onCreateView called")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    // Called when the fragment's view hierarchy has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAGVIRAJ", "Fragment 2: onViewCreated called")
    }

    // Called when the fragment is visible to the user
    override fun onStart() {
        super.onStart()
        Log.d("TAGVIRAJ", "Fragment 2: onStart called")
    }

    // Called when the fragment is no longer visible to the user
    override fun onStop() {
        super.onStop()
        Log.d("TAGVIRAJ", "Fragment 2: onStop called")
    }

    // Called when the fragment's view is being destroyed
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAGVIRAJ", "Fragment 2: onDestroyView called")
    }

    // Called when the fragment itself is being destroyed
    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGVIRAJ", "Fragment 2: onDestroy called")
    }

    // Called when the fragment is no longer attached to its activity
    override fun onDetach() {
        super.onDetach()
        Log.d("TAGVIRAJ", "Fragment 2: onDetach called")
    }
}
