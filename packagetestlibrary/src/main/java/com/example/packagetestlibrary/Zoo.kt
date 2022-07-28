package com.example.packagetestlibrary

import com.example.packagetestlibrary.model.AnimalInterface
import com.example.packagetestlibrary.model.Cat
import com.example.packagetestlibrary.model.ZooEmployee

/**
 * Kotlin Zoo class
 */
class Zoo<T: AnimalInterface> : ZooInterface {

    /**
     *  add animal to the zoo
     */
    fun addAnimal(animal: T) : Boolean {
        return true
    }

    /**
     *   property employees Collection<ZooEmployee>
     */
    val employees: Collection<ZooEmployee> = listOf()

    constructor() {

    }

    constructor(animal: T) {

    }

    private fun doo(){

    }

}