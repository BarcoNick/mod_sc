package com.example.myapplication

open class Human(private var name : String,
            protected var age: Int,
            var alive : Boolean) :Any() {
    open fun details() {
        println("name: $name\nage: $age\nalive: $alive")
    }

}
class Profession(name: String,age: Int, alive: Boolean, val prof: String) : Human(name,age,alive) {
    override fun details() {
        super.details()
        println("profession: $prof")
    }
}

fun main() {
    val h1 = Human("nika",19,true)
    h1.details()
    h1.alive = false
    val p1 = Profession("suxo",45,false,"barista")
    p1.details()
}