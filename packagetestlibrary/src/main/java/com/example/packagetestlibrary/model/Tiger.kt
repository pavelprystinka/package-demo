// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.packagetestlibrary.model

class Tiger(private val name: String) : Cat(name), Striped {
}

interface Striped {

}