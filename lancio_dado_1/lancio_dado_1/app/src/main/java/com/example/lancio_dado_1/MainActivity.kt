package com.example.lancio_dado_1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val foto: ImageView= findViewById(R.id.dado_schermata)
        foto.setImageResource(R.drawable.d20_dice_icosahedron_20_sided_die_number_role_playing_game_rpg_331309_2365)

        var eventoPulsante: Button=findViewById(R.id.btn_clicca)
        eventoPulsante.setOnClickListener{
            val z=(1..20).random()
            when(z){
                1->foto.setImageResource(R.drawable._1)
                2->foto.setImageResource(R.drawable._2)
                3->foto.setImageResource(R.drawable._3)
                4->foto.setImageResource(R.drawable._4)
                5->foto.setImageResource(R.drawable._5)
                6->foto.setImageResource(R.drawable._6)
                7->foto.setImageResource(R.drawable._7)
                8->foto.setImageResource(R.drawable._8)
                9->foto.setImageResource(R.drawable._9)
                10->foto.setImageResource(R.drawable._10)
                11->foto.setImageResource(R.drawable._11)
                12->foto.setImageResource(R.drawable._12)
                13->foto.setImageResource(R.drawable._13)
                14->foto.setImageResource(R.drawable._14)
                15->foto.setImageResource(R.drawable._15)
                16->foto.setImageResource(R.drawable._16)
                17->foto.setImageResource(R.drawable._17)
                18->foto.setImageResource(R.drawable._18)
                19->foto.setImageResource(R.drawable._19)
                20->foto.setImageResource(R.drawable._20)
            }
            TextView.=z.toString()
        }

    }

}
