package com.spengermed.hbgm;

public class Patient {
    private String name;
    private int age;
    private int height;
    private float meanHGS;
    private float risk;

    public Patient(){};
    public Patient(String name, int age, int height, float meanHGS) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.meanHGS = meanHGS;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public float getMeanHGS() {
        return meanHGS;
    }

    //TODO
    public float getRisk() {
        return risk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMeanHGS(float meanHGS) {
        this.meanHGS = meanHGS;
    }
}
