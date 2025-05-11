package com.example.maxcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.maxcloneapp.databinding.FragmentAnaSayfaBinding
import com.example.maxcloneapp.databinding.FragmentFilmDetaylariBinding

class FilmDetaylari : Fragment() {
    private lateinit var binding: FragmentFilmDetaylariBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFilmDetaylariBinding.inflate(inflater, container, false)

        val bundle: FilmDetaylariArgs by navArgs()
        val film = bundle.filmNesnesi

        binding.toolbarDetay.title = film.ad
        binding.tvAciklama.text = "${film.aciklama}"

        binding.ivFilm.setImageResource(
            resources.getIdentifier(film.resim, "drawable", requireContext().packageName))

        return binding.root
    }
}