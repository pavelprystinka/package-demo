// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.packagetestlibrary.model

/**
 *  Kotlin AnimalInterface
 */
public interface AnimalInterface {
    fun sleep(minutes: Int) : String
    fun eat(food: String)

    val age: Int
}