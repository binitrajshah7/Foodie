package com.gmail.foody.ui.fragments.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.foody.R

/**
 * A simple [Fragment] subclass.
 * Use the [FavouriteRecipesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavouriteRecipesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourite_recipes, container, false)
    }
}