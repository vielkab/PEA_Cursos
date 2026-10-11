package com.example.cursos.data

import com.example.cursos.R
import com.example.cursos.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.arquitectura),
        Topic(R.string.crafts, 121, R.drawable.manualidades),
        Topic(R.string.business, 78, R.drawable.negocios),
        Topic(R.string.culinary, 118, R.drawable.gastronomia),
        Topic(R.string.design, 423, R.drawable.dise_o),
        Topic(R.string.fashion, 92, R.drawable.moda),
        Topic(R.string.film, 165, R.drawable.cinematografia),
        Topic(R.string.gaming, 37, R.drawable.gamer),
        Topic(R.string.drawing, 326, R.drawable.dibujo),
        Topic(R.string.lifestyle, 305, R.drawable.estilovida),
        Topic(R.string.music, 212, R.drawable.musica),
        Topic(R.string.painting, 172, R.drawable.pintura),
        Topic(R.string.photography, 321, R.drawable.fotografia),
        Topic(R.string.tech, 118, R.drawable.tecnologia),
    )
}