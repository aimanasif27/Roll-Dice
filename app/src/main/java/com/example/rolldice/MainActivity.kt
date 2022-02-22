package com.example.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            //  val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            // toast.show()
            rollDice()
            }
        }
        // function to roll the dice and update screen with difference values.
        private fun rollDice() {
            val dice = Dice(6) //new dice obj for having 6 sides
            val diceRoll = dice.roll()
            //val resultTextView: TextView = findingViewById(R.id.textView)
            //diceRoll.tostring().also { resultTextView.text = it }
            val diceImage: ImageView = findViewById(R.id.imageView)
            diceImage.contentDescription = diceRoll.toString()

            val drawableResource = when (diceRoll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription = diceRoll.toString()
           }
        }
class Dice(val numSide: Int){

    fun roll(): Int {
        return(1..numSide).random()
    }
}










