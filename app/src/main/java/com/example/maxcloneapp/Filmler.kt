package com.example.maxcloneapp

import java.io.Serializable


data class Filmler(var id: Int,
                   var ad: String,
                   var resim: String,
                   var aciklama: String) : Serializable {
}