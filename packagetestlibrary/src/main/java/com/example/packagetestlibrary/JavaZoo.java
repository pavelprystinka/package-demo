// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.packagetestlibrary;

import com.example.packagetestlibrary.model.AnimalInterface;

public class JavaZoo <T extends AnimalInterface> implements ZooInterface {

    public final String name;

    public JavaZoo(String name) {
        this.name = name;
    }
}
