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
        tiposDeDatos()
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

}