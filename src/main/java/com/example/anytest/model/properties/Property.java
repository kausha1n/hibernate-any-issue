package com.example.anytest.model.properties;

public interface Property<T> {
    Long getId();

    String getName();

    T getValue();
}