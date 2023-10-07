package com.example.basics.data.types;

public class J08a_depositChallange {
    public static void main(String[] args) {

        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float interest = deposit * numDays * interestRate / daysInYear;
        System.out.println("Interest: " + interest);

        float taxValue = interest * tax;
        System.out.println("Tax Value: " + taxValue);

        float incomeAfterTax = interest - taxValue;
        System.out.println("Income After Tax: " + incomeAfterTax);
    }
}
