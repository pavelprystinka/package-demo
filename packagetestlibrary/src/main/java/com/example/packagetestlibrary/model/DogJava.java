package com.example.packagetestlibrary.model;


import androidx.annotation.NonNull;

import com.example.packagetestlibrary.JavaZoo;

/**
 *  Java Dog
 */
public class DogJava <T> implements AnimalInterface {

    @NonNull
    @Override
    public String sleep(int minutes) {
        return null;
    }

    @Override
    public void eat(@NonNull String food) {
    }

    @Override
    public int getAge() {
        return 0;
    }

    public <K> DogJava() {

    }

    public DogJava(String s) {

    }
}
