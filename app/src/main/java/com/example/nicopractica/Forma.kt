package com.example.nicopractica

import kotlin.math.PI

open class Forma(val nombre: String) {
    open fun area() = 0.0
}


class Circulo(nombre: String, val radio: Double) : Forma(nombre) {
    override fun area() = PI * radio * radio
}

class Cuadrado(nombre: String, val lado: Double) : Forma(nombre){
    override fun area() = lado * lado
}
class Rectangulo(nombre: String,val largo: Double, val alto: Double) : Forma(nombre) {
    override fun area() = alto * largo
}

fun main(args: Array<String>){
    val circulo = Circulo("Circulo", 4.0)
    println(circulo.nombre)
    println(circulo.radio)
    println(circulo.area())
}