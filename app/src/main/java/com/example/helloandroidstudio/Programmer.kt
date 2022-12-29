package com.example.helloandroidstudio

class Programmer(val name: String, val age: Int, val languages: Array<String>) {

    fun code(){
        for ( i in languages){
            println("Sé programar en $i")
        }
    }
}