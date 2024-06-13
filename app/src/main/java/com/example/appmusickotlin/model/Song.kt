package com.example.appmusickotlin.model


import java.io.Serializable

data class Song(
    val id : String? = null,
    val name : String? = null,
    val duration : Long? = null,
    val albumId : Long? = null,
    val artist : String? = null,
    val data : String? = null
) : Serializable