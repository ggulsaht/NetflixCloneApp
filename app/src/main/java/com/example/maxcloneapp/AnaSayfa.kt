package com.example.maxcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.maxcloneapp.databinding.FragmentAnaSayfaBinding


class AnaSayfa : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1, "CHERNOBYL", "chernobyl", aciklama = "1986 senesinde Sovyet nükleer santralinde meydana gelen patlama sonrası santral işçileri ve itfaiyeciler faciayı kontrol altına almaya çalışır")
        val f2 = Filmler(2, "BEHZAT Ç.", "behzatc", aciklama ="Behzat Ç (Erdal Beşikçioğlu), 1985 yılında Polis Akademisi'nden mezun olmuş, cinayet bürosunda görev yapmakta olan bir polistir. Hizmet verdiği süre içerisinde almış olduğu cezalar nedeni ile hep başkomiser olarak kalmıştır. Behzat'ın eski eşi ile yaşadığı problemler kızına karşı ilgisiz kalmasına sebep olur. Bir süre sonra kızı Berna (Hazal Kaya) intihar eder. Behzat, bu olaydan sonra yıkılır. Behzat Ç. ve ekibinde yer alan polisler Harun (Fatih Artman), Hayalet (İnanç Konukçu), Akbaba (Berkan Şal), Eda (Seda Bakan), Selim (Hakan Hatipoğlu) ve Cevdet (Berke Üzrek), sezon boyunca bir yandan Behzat'ın kızının ölümü ile ilgili olabilecek kişiler ile ilişki kurarken, bir yandan da her bir bölümde yaşanan farklı cinayetlerin çözümü ile uğraşırlar." )
        val f3 = Filmler(3, "GAME OF THRONES", "gameofthrones", aciklama ="Dizinin ilk bölümünde Lort Ned Stark bir Gece Nöbeti firarisinin getirdiği rahatsız edici haberler yüzünden tedirgin olur, Kral Robert Kıştepesi'ne varır.")
        val f4 = Filmler(4, "THE LAST OF US", "thelastofus", aciklama ="Seattle'da Ellie ve Dina kendilerini yobaz Seraphite'lar ile acımasız milislerin arasındaki savaşın ortasında bulurlar.")
        val f5 = Filmler(5, "HARRY POTTER", "harrypotter", aciklama ="Harry, 11 yaşında Hogwarts'a kabul edilir ve yasaklı koridorda Felsefe Taşı’nı keşfeder. Voldemort da taşı ararken, Harry intikam almak ister.")
        val f6 = Filmler(6, "THE PENGUİN", "thepenguin", aciklama ="Oswald Chesterfield Cobblepot nam-ı diğer Penguen'in, Gotham Şehri'nin yeraltı suç dünyasındaki yükselişinin hikayesi.")
        val f7 = Filmler(7, "MAGARSUS", "magarsus", aciklama ="Halil Kurak, bölgede kurduğu iktidarına tehdit oluşturan Amerikalı Golden & Orange firmasının önünü kesmeye çalışır. Öte yandan Turgut ve Beton’un hasat sırasında bir çiftçiyle yaşadığı tartışma sonu kanla bitecek olayların fitilini ateşler.")
        val f8 = Filmler(8, "PRENS", "prens", aciklama ="Prens dizisi, Bongomia Krallığı'nın en az sevilen oğlunun hikâyesini konu alır. Öyle istenmemiş ki bir isim bile verilmemiştir, Prens olarak anılır.")
        val f9 = Filmler(9, "EUPHORİA", "euphoria", aciklama ="")
        val f10 = Filmler(10, "GODZİLLA", "godzilla", aciklama ="")
        val f11 = Filmler(11, "AQUAMAN", "aquaman", aciklama ="")
        val f12 = Filmler(12, "I AM LEGEND", "iamlegend", aciklama ="")

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