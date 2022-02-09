package com.example.unit1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DiceRoller : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)

        val rollButton: Button = findViewById<Button>(R.id.buttonRoll)


        rollButton.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val rolledText = findViewById<TextView>(R.id.TextDice)
        val dice = Dice(6)
        val diceImg = findViewById<ImageView>(R.id.diceView)

        val rolled = dice.roll()
        val drawableResource = when(rolled){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        diceImg.setImageResource(drawableResource)
        diceImg.contentDescription = rolled.toString()

        rolledText.text = rolled.toString()

    }
}