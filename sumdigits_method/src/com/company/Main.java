package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits is " + digitSumChallenge(125));
        System.out.println("The sum of the digits is " + digitSumChallenge(-125));
        System.out.println("The sum of the digits is " + digitSumChallenge(5));
        System.out.println("The sum of the digits is " + digitSumChallenge(32123));
//        digitSumChallenge()

    }

    private static int digitSumChallenge(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 _-> 125-120 = 5
        while (number > 0 ){
            // extract least significant digit
            int digit = number % 10;
            sum += digit;
            // drop least significant digit
            number /= 10; // same as number = number / 10
        }
        return sum;
    }
}
