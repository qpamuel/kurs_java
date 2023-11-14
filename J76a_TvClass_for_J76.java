package com.example.oop.basics;

public class J76a_TvClass_for_J76 {
    String manufacturer;
    String model;
    int year;
    String uniqueId;
    float numInches;
    float weight;
    String color;
    String maxResolution; // 4k, 1080p

    public void printBasicData() {
        System.out.println(
                this.manufacturer +
                " " + this.model +
                " " + this.year
        );
    }
}
