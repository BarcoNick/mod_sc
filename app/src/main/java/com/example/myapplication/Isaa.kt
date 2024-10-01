package com.example.myapplication

interface Isaa{
    fun details()
    fun invert():String
}

class Fraction(val numerator :Double,val denominator :Double):Isaa {
    override fun details() {

    }

    override fun invert(): String {
        return "$denominator/$numerator"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            return numerator == other.numerator*denominator/other.denominator
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun hashCode(): Int {
        var result = numerator.hashCode()
        result = 31 * result + denominator.hashCode()
        return result
    }

}

fun main() {
    val f1 = Fraction(4.3,6.2)
    val f2 = Fraction(4.3,6.2)
    println(f1==f2)
    println(f1)
    println(f2)
    println(f1.invert())
}