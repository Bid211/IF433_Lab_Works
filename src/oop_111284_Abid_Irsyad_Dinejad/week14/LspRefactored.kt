package oop_111284_Abid_Irsyad_Dinejad.week14

interface Shape {
    fun area(): Int
}

class SafeRectangle(var width: Int, var height: Int) : Shape {
    override fun area() = width * height
}

class SafeSquare(var side : Int) : Shape {
    override fun area() = side * side
}