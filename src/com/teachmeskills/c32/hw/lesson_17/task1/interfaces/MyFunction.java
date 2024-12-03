package com.teachmeskills.c32.hw.lesson_17.task1.interfaces;

@FunctionalInterface
public interface MyFunction<T>{
    T apply(T input);
}

