package com.example.rolandodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // findViewById(id)

        val button6 = findViewById<Button>(R.id.buttonD6)
        val button12 = findViewById<Button>(R.id.buttonD12)
        val button20 = findViewById<Button>(R.id.buttonD20)

        button6.setOnClickListener {
            rolarDados(6,1)
        }

        button12.setOnClickListener {
            rolarDados(12,2)
        }

        button20.setOnClickListener {
            rolarDados(20, 3)
        }
    }

    private fun rolarDados(lados: Int, esco: Int){
        val rolagem = (1..lados).random()

        when(esco){
            1 ->{
                val textDado06 = findViewById<TextView>(R.id.textDado06)
                textDado06.text = rolagem.toString()
            }
            2 ->{
                val textDado12 = findViewById<TextView>(R.id.textDado12)
                textDado12.text = rolagem.toString()
            }
            3 ->{
                val textDado20 = findViewById<TextView>(R.id.textDado20)
                textDado20.text = rolagem.toString()
            }
        }

    /*
        val image = findViewById<ImageView>(R.id.imageLados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }
        */
    }
}