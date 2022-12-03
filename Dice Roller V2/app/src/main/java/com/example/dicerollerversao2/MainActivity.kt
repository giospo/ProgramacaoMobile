package com.example.dicerollerversao2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import com.example.dicerollerversao2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton: Button = binding.rollButton
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {

        val randomInt = (1..6).random()
        val toast = Toast.makeText(this, "Rolou um Dado!", Toast.LENGTH_SHORT)
        toast.show()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = randomInt.toString()

        val resultTextView: TextView = binding.resultText
        resultTextView.text = randomInt.toString()
    }
}