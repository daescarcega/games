package com.example.games

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.memorama.MemoramaActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_menu)
    }

    fun selectGame(view: View){
        if(view.id == R.id.tic){
            val ticIntent = Intent(this, GatoActivity::class.java).apply {
                putExtra("name", "Tic Tac Toe")
            }
            startActivity(ticIntent)
        }else if (view.id == R.id.memorama){
            val ticIntent = Intent(this, MemoramaActivity::class.java).apply {
                putExtra("name", "Memorama")
            }
            startActivity(ticIntent)
        }

    }
}
