package com.example.netflixcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.netflixcloneapp.databinding.FragmentAnaSayfaBinding


class AnaSayfa : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1, "Kimler geldi kimler geçti", "kimlergeldi", aciklama = "Sevgilisinden yeni ayrılan avukat leyla,tatilde tanıştığı yakışıklı şef Feyyaz'la çıkmaya başlar.Bir yandan da iş adamı Cem Murathan'ın boşanma davasını üstlenir. Sevgilisinden yeni ayrılan avukat leyla,tatilde tanıştığı yakışıklı şef Feyyaz'la çıkmaya başlar.Bir yandan da iş adamı Cem Murathan'ın boşanma davasını üstlenir.")
        val f2 = Filmler(2, "Black Mirror", "blackmirror", aciklama ="Tek başına dramlar sunan, teknoloji paranoyasını araştıran keskin, gerilimli, hicivli hikayeler içeren Black Mirror, modern dünyayla ilgili kolektif huzursuzluğa değinen hikayelerle Alacakaranlık Kuşağı'nın çağdaş bir yeniden yorumudur. " )
        val f3 = Filmler(3, "You", "you", aciklama ="")
        val f4 = Filmler(4, "İstanbul Ansiklopedisi", "istanbul", aciklama ="Seattle'da Ellie ve Dina kendilerini yobaz Seraphite'lar ile acımasız milislerin arasındaki savaşın ortasında bulurlar.")
        val f5 = Filmler(5, "Sonsuzluk Yolcusu", "sonsuzluk", aciklama ="Harry, 11 yaşında Hogwarts'a kabul edilir ve yasaklı koridorda Felsefe Taşı’nı keşfeder. Voldemort da taşı ararken, Harry intikam almak ister.")
        val f6 = Filmler(6, "Cassandra", "cassandra", aciklama ="Oswald Chesterfield Cobblepot nam-ı diğer Penguen'in, Gotham Şehri'nin yeraltı suç dünyasındaki yükselişinin hikayesi.")
        val f7 = Filmler(7, "EMILY IN PARIS", "emilyinparis", aciklama ="Halil Kurak, bölgede kurduğu iktidarına tehdit oluşturan Amerikalı Golden & Orange firmasının önünü kesmeye çalışır. Öte yandan Turgut ve Beton’un hasat sırasında bir çiftçiyle yaşadığı tartışma sonu kanla bitecek olayların fitilini ateşler.")
        val f8 = Filmler(8, "Kral Kaybederse", "kralkaybederse", aciklama ="Prens dizisi, Bongomia Krallığı'nın en az sevilen oğlunun hikâyesini konu alır. Öyle istenmemiş ki bir isim bile verilmemiştir, Prens olarak anılır.")
        val f9 = Filmler(9, "SICAK KAFA", "sicakkafa", aciklama ="")
        val f10 = Filmler(10, "Squid Game", "squidgame", aciklama ="")
        val f11 = Filmler(11, "THE WALKING DEAD", "thewalking", aciklama ="")
        val f12 = Filmler(12, "THE 100", "theyuz", aciklama ="")

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)
        filmlerListesi.add(f7)
        filmlerListesi.add(f8)
        filmlerListesi.add(f9)
        filmlerListesi.add(f10)
        filmlerListesi.add(f11)
        filmlerListesi.add(f12)

        val filmlerAdapter = FilmlerAdapter(requireContext(), filmlerListesi)
        binding.filmlerRv.adapter = filmlerAdapter

        binding.filmlerRv.layoutManager =
            StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)


        return binding.root
    }
}