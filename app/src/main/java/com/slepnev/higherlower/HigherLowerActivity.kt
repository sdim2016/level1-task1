package com.slepnev.higherlower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_higher_lower.*

class HigherLowerActivity : AppCompatActivity() {

    private var currentThrow: Int = 1
    private var lastThrow: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_higher_lower)
    }

    /**
     * Set the initial (UI) state of the game.
     */
    private fun initViews() {

        btLower.setOnClickListener{ onLowerClick() }
        btEquals.setOnClickListener{ onEqualClick() }
        btHigher.setOnClickListener{ onHigherClick() }

        updateUI()
    }

    /**
     * Update the last throw text and the dice image resource drawable with the current throw.
     */
    private fun updateUI() {
        tvLastThrow.text = getString(R.string.last_throw, lastThrow)
    }

    private fun rollDice() {
        lastThrow = currentThrow
        currentThrow = (1..6).random()
        updateUI()
    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    private fun onHigherClick() {

    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    private fun onLowerClick() {

    }

    /**
     * Calls [rollDice] and checks if the answer is correct.
     */
    private fun onEqualClick() {

    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {

    }

    /**
     * Displays a incorrect Toast message.
     */
    private fun onAnswerIncorrect() {

    }



}
