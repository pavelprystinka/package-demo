// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.packagetestlibrary

import com.example.packagetestlibrary.model.AnimalInterface

val Zoo<AnimalInterface>.employeeCount: Int
    get() {
        return this.employees.size
    }

val String.size: Int
    get(){
        return this.length
    }

fun String.ToUpper(): String {
    return this.toUpperCase()
}

