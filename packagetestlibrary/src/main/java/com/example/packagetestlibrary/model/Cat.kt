package com.example.packagetestlibrary.model;

/**
 * Kotlin Cat
 *
 * This class has no useful logic; it's just a documentation example.
 *
 * @property name the name of cat.
 * @constructor Creates an empty group.
 */
@Deprecated("it is deprecated")
open class Cat(private val name: String) : AnimalInterface {

    /**
     * Can will sleep
     */
    override fun sleep(minutes: Int): String {
        TODO("Not yet implemented")
    }

    fun <T: AnimalInterface>sleep(): String {
        TODO("Not yet implemented")
    }

    override fun eat(food: String) {

    }

    override val age: Int
        get() = 5
}

/**
 * some internal class
 */
internal class SomeInternalKotlinClass {
    fun add(a:Int, b:Int): Int {
        return a + b;
    }
}