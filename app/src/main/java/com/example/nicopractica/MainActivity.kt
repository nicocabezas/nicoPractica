package com.example.nicopractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()

        //tiposDeDatos()

//        sentenciaIf()

        //sentenciaWhen()

//        arrays()

        //maps()

        //loops()

 //       funciones()

//        val sumResult = sumTwoNumbers(5,5)
//
//        println(sumResult)
//
//        println(sumTwoNumbers(15,9))
//
//        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))

//        classes()

//    val nombre = "Nico"
//        println("Remover el primer caracter: ${nombre.removerPrimerCaracter()}")

        val name= "AndroidTv"
        println("$name esta por")

        val tv = SmartTv("AndroidTv","Entretenimiento")
        tv.prende()

        var speakerVolume = 2

    }

//    fun String.removerPrimerCaracter(): String = this.substring(1)
    /*
    Aqui vamos a hablar de variables y constantes
     */
    class SmartTv(name: String,category : String){

    var deviceStatus = "online"

        fun prende(){
            println("Encender el tv")
        }
        fun apaga(){
            println("Apagar el tv")
        }
    }

    private fun variablesYConstantes(){
        //variables
        var myFirstVariable = "Hello Master"

        println(myFirstVariable)

        myFirstVariable = "Bienvenido al Mundo Android"

        println(myFirstVariable)

        //no podemos asignar un tipo INt a una variable
        //de tipo string

        var mySecondVariable = "Daleeeeeeeeeee River!!"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "De nuevo al Mundillo Android"

        println(myFirstVariable)

        //CONSTANTES

        val myFirstConstant = "Mostrame tu cel"

        println(myFirstConstant)

        // una constante no puede modificar su valor
        //myFirstConstant = "ya te lo mostre"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)

    }
    /*
    Veamos los tipos de datos basicos (data types)
     */
    private fun tiposDeDatos() {

        //String

        val myString = "Hola Nicolas"
        val myString2 = "Bienvenido al mundillo de Android"
        val myString3 = myString + " " + myString2

        println(myString3)

        //Enteros (Byte, Short, Int, Long)

        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2

        println(myInt3)

        //Decimales (Float hasta 32bit, Double 1 de 64 bit)

        val myDouble = 1.5
        val myDouble2 = 1.5
        val myDouble3 = 2.5

        val myDouble4 = myDouble + myDouble2 + myDouble3

        println(myDouble4)

        // Boolean (Bool)

        val myBool = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    private fun sentenciaIf(){

        val myNumber = 70

        //operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigualdad

        //operadores logicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if ((myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("${myNumber} es menor o igual que 10 y mayor que 5 o es igual a 53")
        }else if (myNumber == 60){
            println("${myNumber} es igual a 60")
        }else if (myNumber == 70){
            println("${myNumber} es igual a 70")
        } else{
            println("${myNumber} es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }

    private fun sentenciaWhen(){

        val country = "EEUU"

        when (country) {
            "España", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("el idioma es español")
            }
            "EEUU" -> {
                println("el idioma es ingles")
            }
            "Francia" -> {
                println("el idioma es frances")
            } else ->{
                println("no conocemos el idioma")
            }
        }
        // When con int
        val age = 100

        when (age) {
            0, 1, 2 -> {
                println("Eres un bebe")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolecente")
            }
            in 18..69 -> {
                println("Eres un adulto")
            }
            in 70..99 -> {
                println("Eres un anciano")
            } else ->{
               println("emoticon")
        }

        }

    }
    private fun arrays(){
        var recibos: Array<String> = arrayOf("agua","luz","gas")
        recibos.set(2,"internet")
        recorrer_array(recibos)

        var matriz = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6,7,8,9,10),
            intArrayOf(11,12,13)
        )

        for (i in (0 until matriz.size)){
            println()
            for (j in(0 until matriz[i].size))
                println("Posicion[$i][$j] : $matriz[$i][$j]")
        }

        var clientesVIP : Set<Int> = setOf(1234,5678,4040)

        var divisas: List<String> = listOf()


//        val name = "Nico"
//        val surname = "Cabezas"
//        val company = "nacionServicios"
//        val age = "33"
//
//        val myArray = arrayListOf<String>()
//        //añadir datos de uno a uno
//
//        myArray.add(name)
//        myArray.add(surname)
//        myArray.add(company)
//        myArray.add(age)
////        myArray.add(age)
//
//        println(myArray)
//
//        //añado conjunto de datos
//        myArray.addAll(listOf("Hola", "Bienvenidos a tutorial"))
//
//        //accedo a datos
//        val myCompany = myArray[2]
//        println(myCompany)
//
//        //modifico datos
//        myArray[5] = "Suscribite a mi tuto"
//        println(myArray)
//
//        //elimino un dato
//        myArray.removeAt(2)
//        println(myArray)
//
//        //recorrer datos
//        myArray.forEach{
//            println(it)
//        }



    }

    fun recorrer_array(a: Array<String>){

        for (i in a)
            println(i)

        for (i in a.indices)
            println(a.get(i))

        for (i in 0.. a.size -1)
            println("${i+1}: ${a.get(i)}")

    }






    private fun maps(){

        //sintaxis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //añado elementos
        myMap = mapOf("Cabezas" to 1, "Pedro" to 2, "Nacho" to 3)
        println(myMap)

    }

    private fun loops(){
        //bucles para recorrer estructuras, arrays o mapas
        val myArray = listOf("Hola", "Bienvenido al tuto", "Suscribete!")
        val myMap = mutableMapOf("Cabezas" to 1, "Pedro" to 2, "Nacho" to 3)

        //for
        for (myString in myArray){

            println(myString)

        }
        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }
        for (x in 9 until 30){
            println(x)
        }


    }

    fun funciones(){

        sayHello()
        sayHello()
        sayHello()

        sayMyName("nico")
        sayMyName("Pedro")
        sayMyName("Nacho")

        sayMyNameAndAge("Nico", 33)
    }
    //funcion simple
    fun sayHello(){
        println("Hola!")
    }
    //funcion con parametro de entrada
    fun sayMyName(name: String){
        println("Hola, mi nombre es ${name}")
    }
    //funcion con mas de un parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola, mi nombre es ${name} y mi edad es ${age}")
    }
    //funcion con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    //instanciar la clase
    fun classes(){

        val cabezas = Programmer("Nico",33, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))

        println(cabezas.name)
        cabezas.code()

        val pedro = Programmer("Pedro",20, arrayOf(Programmer.Language.JAVA), arrayOf(cabezas))
        pedro.code()


        println("${pedro.friends?.first()?.name} es amigo de ${pedro.name}")
    }


}