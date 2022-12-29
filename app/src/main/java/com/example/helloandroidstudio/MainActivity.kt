package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2
        //tiposDeDatos()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //sentenciaArrays()

        // Leccion 6
        //funcionMapas()

        // Leccion 7
        //loops()

        // Leccion 8
        // nullPointerException()

        // Leccion 10
        classes()
    }

    private fun variablesyconstantes(){
        // Variables
        var myFirstVariable = "Hello Adrian!"
        println(myFirstVariable)

        // Constantes

        val myFirstConstant = "Tutorial"

        println(myFirstConstant)
    }

    private fun tiposDeDatos(){

        //String
        val myString: String = "Hola :)"
        val myString2 = "Bienvenido!"
        val myString3: String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3: Int = myInt + myInt2

        println(myInt3)

        //Decimales (Float, Double)

        val myDouble: Double = 1.5
        val myFloat: Float = 1.5f
        val myDouble2 =  myDouble + myFloat

        println(myDouble2)

        //Boolean (Bool)
        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)


    }

    private fun sentenciaWhen(){
        val country = "España"

        when(country){
            "España" -> {
                println("El idioma es Español")
            }
            else -> {
                println("El idioma es Inglés")
            }
        }
    }

    private fun sentenciaArrays(){
        val name = "Adrian"
        val surname = "Sanchez"
        var age = "24"

        val myPerson: ArrayList <String> = arrayListOf<String>()

        myPerson.add(name)
        myPerson.add(surname)
        myPerson.add(age)

        println(myPerson)

        // Añadir varios String

        myPerson.addAll(listOf(name,surname, age))
        println(myPerson)

        println(myPerson[0])

        myPerson.forEach {
            println(it)
        }
        println(myPerson.count())
        myPerson.clear()
        println(myPerson.count())


    }

    private fun funcionMapas(){
        var myMap: Map<String, Int> = mapOf()

        // Añadir elementos
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2)
        println(myMap)

        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria", 8)

        println(myMap)

        // Acceso a datos
        println(myMap["Brais"])

        //Eliminar datos
        myMap.remove("Brais")
        println(myMap)
    }

    private fun loops(){
        val name = "Adrian"
        val surname = "Sanchez"
        val age = "24"

        val myArray:List<String> = listOf(name, surname, age)
        val myMap: MutableMap<String, Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        for (myString in myArray){
            println(myString)
        }
        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }
        for(x:Int in 0..10)
            println(x)
    }

    private fun nullPointerException(){
        var myString = "Adrian"
        println(myString)

        //myString = null

        // Variable null safety
        var mySafetyString: String? = "Adrian null safety"
        mySafetyString = null
        println(mySafetyString?.length)


        mySafetyString?.let {
            //println(it?)
        } ?: run {
            println(mySafetyString)
        }


    }

    private fun classes(){
        val adrian = Programmer(name = "Adrian", age = 24, languages = arrayOf("C", "C++"))

        println(adrian.name)
        adrian.code()
    }
}