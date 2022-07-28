package com.example.packagetestlibrary.model

/**
 *  Kotlin data class ZooEmployee
 */
data class ZooEmployee(var firstName: String, var age: Int) : EmployeeInterface<String> {
}

interface EmployeeInterface<T> {

}