package com.example.guessgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.guessgame.databinding.FragmentGameBinding
import com.example.guessgame.databinding.FragmentScoreBinding

// TODO: Rename parameter arguments, choose names that match

class ScoreFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding:FragmentScoreBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_score,container,false)

        binding.playAgainButton.setOnClickListener {
            findNavController().navigate(R.id.action_scoreFragment_to_gameFragment)
        }

        return binding.root
    }
}