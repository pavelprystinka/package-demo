// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.packagetestlibrary

import com.example.packagetestlibrary.model.CitySize
import com.example.packagetestlibrary.model.EmployeeInterface
import com.example.packagetestlibrary.model.Tiger

class City<T: EmployeeInterface<List<String>>> : CityInterface<Zoo<Tiger>> {

    private var _name: String? = null
    internal var internalName: String? = null


    val name: String? = null

    open var age: Int = 5
    var size: CitySize = CitySize.MEDIUM



    class CityBlock(val name: String) {

    }

    internal class InternalCityBlock(val name: String) {
    }

    companion object {
        val cityCount: Int
            get() {
                return Earth.cities.size
            }
    }

    private fun privateFun() { }

    internal fun internalFun() { }
}

interface CityInterface<T: ZooInterface> {

}