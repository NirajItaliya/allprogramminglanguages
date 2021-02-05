package com.example.makecoding.makecoding.Adapter;

public class HomeDataModel {
    String name;
    int age;
    public HomeDataModel(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public HomeDataModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
