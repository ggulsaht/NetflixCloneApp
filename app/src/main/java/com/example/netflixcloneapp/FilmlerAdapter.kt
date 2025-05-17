package com.example.netflixcloneapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixcloneapp.databinding.CardTasarimBinding
import com.example.netflixcloneapp.databinding.FragmentAnaSayfaBinding

class FilmlerAdapter(var mContext: Context, var filmlerListesi: List<Filmler>) :
    RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
       var binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)

    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        var film = filmlerListesi.get(position)
        var t = holder.tasarim

        t.imageViewFilm.setImageResource(
            mContext.resources.getIdentifier(film.resim, "drawable", mContext.packageName))

        t.cardViewFilm.setOnClickListener {
            val gecis = AnaSayfaDirections.detaygecis(filmNesnesi = film)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}