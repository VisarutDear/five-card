package com.visarut.fivecard.view.feature.featurePlay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.visarut.fivecard.R
import com.visarut.fivecard.databinding.PlayFramentBinding
import com.visarut.fivecard.domain.model.PlayerData
import org.koin.androidx.viewmodel.ext.android.viewModel

class PlayFramgent : Fragment() {

    private val viewModel: PlayFramgentViewModel by viewModel()
    private lateinit var binding: PlayFramentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= DataBindingUtil.inflate(inflater,R.layout.play_frament, container, false)

        binding.lifecycleOwner= this

        binding.buttonUpdateCard.setOnClickListener {
            viewModel.updateCard()
        }

        val playFragmentController = PlayHomeController()

        binding.epoxyList.setController(playFragmentController)

        viewModel.playerList.observe(viewLifecycleOwner, {
            val playerData = PlayerData(viewModel.playerList)
            playFragmentController.setData(playerData)
        })

        return binding.root
    }
}