package com.spengermed.hbgm;

public class Patient {
    private String name;
    private int age;
    private int height;
    private float meanHGS;
    private double risk;

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

    //TODO (recheck meanHGS conditions)
    public double getRisk() {
        //Age = 17-19
        if (age >= 17 && age < 20){
            if(height >= 150 && height < 155 && meanHGS < 27.8){
                this.risk = 21.6;
            } else if (height >= 155 && height < 160 && meanHGS >= 27.8 && meanHGS < 29.2){
                this.risk = 22.9;
            } else if (height >= 160 && height < 165 && meanHGS >= 29.2 && meanHGS < 30.2){
                this.risk = 24;
            } else if (height >= 165 && height < 170 && meanHGS >= 30.2 && meanHGS < 31.2){
                this.risk = 25;
            } else if (height >= 170 && height < 175 && meanHGS >= 31.2 && meanHGS < 32.2){
                this.risk = 26;
            } else if (height >= 175 && height < 180 && meanHGS >= 32.2 && meanHGS < 33.0){
                this.risk = 26.7;
            } else if (height >= 180 && height < 185 && meanHGS > 33.0) {
                this.risk = 27.6;
            }
        // Age = 20-24
        } else if (age >= 20 && age < 25) {
            if(height >= 150 && height < 155 && meanHGS < 29.1){
                this.risk = 23.7;
            } else if (height >= 155 && height < 160 && meanHGS >= 29.1 && meanHGS < 30.2){
                this.risk = 24.8;
            } else if (height >= 160 && height < 165 && meanHGS >= 30.2 && meanHGS < 31.5){
                this.risk = 26.1;
            } else if (height >= 165 && height < 170 && meanHGS >= 31.5 && meanHGS < 32.5){
                this.risk = 27.1;
            } else if (height >= 170 && height < 175 && meanHGS >= 32.5 && meanHGS < 33.4){
                this.risk = 28;
            } else if (height >= 175 && height < 180 && meanHGS >= 33.4 && meanHGS < 34.5){
                this.risk = 29;
            } else if (height >= 180 && height < 185 && meanHGS > 34.5) {
                this.risk = 29.6;
            }
        }
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
