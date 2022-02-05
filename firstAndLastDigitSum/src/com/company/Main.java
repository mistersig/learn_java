package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int testnumber = sumFirstAndLastDigit(1234);
        System.out.println(testnumber);
    }

    public static int sumFirstAndLastDigit(int number){

        if (number == -1){
            return -1;
        }
        int lastDigit, firstDigits, divisor;
        lastDigit = number % 10;
        firstDigits = number;

        while (firstDigits >= 10){
                firstDigits /= 10;
    }
        return firstDigits + lastDigit;


//        if (number > 0){
//
//        }
    }
}
