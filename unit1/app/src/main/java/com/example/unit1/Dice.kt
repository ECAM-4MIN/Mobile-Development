package com.example.unit1

class Dice(private var sides: Int) {

    fun roll(): Int {
        var rolled = 1
        if (sides >1){
            rolled = (1..sides).random()
        }

        return rolled
    }

    fun set_sides(newSides : Int){
        sides = newSides
    }
}