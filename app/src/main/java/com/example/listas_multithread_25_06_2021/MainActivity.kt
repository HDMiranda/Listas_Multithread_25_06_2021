package com.example.listas_multithread_25_06_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val rvLista = findViewById<RecyclerView>(R.id.rvLista)

    val fridayThe13 = Filme("Sexta-Feira 13", "https://upload.wikimedia.org/wikipedia/pt/b/b7/Sexta_Feira_13_%281980%29.jpg")
    val fastAndFurious = Filme("Velozes e Furiosos", "https://upload.wikimedia.org/wikipedia/pt/f/f9/TheFastandtheFurious.jpg")
    val lordOfTheRings = Filme("O Senhor dos Anéis", "https://images-na.ssl-images-amazon.com/images/I/8150KG7y2EL.jpg")
    val godzilla = Filme("Godzilla", "https://img.elo7.com.br/product/original/26504FC/big-poster-filme-godzilla-lo02-tamanho-90x60-cm-geek.jpg")
    val avengers = Filme("Vingadores", "https://i.pinimg.com/originals/1f/26/d3/1f26d3c52508b1a46235e0cf7087ab65.jpg")

    val items = listOf(fridayThe13, fastAndFurious, lordOfTheRings, godzilla, avengers)

    rvLista.layoutManager = LinearLayoutManager(this)
    rvLista.adapter = ItemAdapter(items)
  }
}