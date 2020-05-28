package com.example.projekt;

public class Breed {
    private String name;
    private String company;
    private int size;

    public Breed(String name, String company, int size) {
        this.name = name;
        this.company = company;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return name;
    }
}