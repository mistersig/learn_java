package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int testNumber = 101;
        int testNumber = 16461;
//        int testNumber = 242;

        if (isPalindrome(testNumber)){
            System.out.println("Is a palindrom");
        }else{
            System.out.println("Is not a Palindrom");
        }

        String newTestString = "Hannah";

        if (stringPalindrome(newTestString)){
            System.out.println("the word " + newTestString +" is a Palindrom");
        }else{
            System.out.println("the word " + newTestString +" is NOT a Palindrom");
        }
//
//        isPalindrome(202);
//        isPalindrome(2202);
//        isPalindrome(202020);
    }

    public static  boolean isPalindrome( int number){
//        return true;
        int originalNUm = number, reverse = 0, remainder;
// don't get hung up on the math. It's mathematical formula
        while (number != 0){
            System.out.println("the START of the number:" + number);
            remainder = number % 10;
            System.out.println("the remainder :" + remainder);
            reverse = reverse * 10 + remainder;
            System.out.println("the reverse :" + reverse);
            number /= 10;
            System.out.println("the number END:" + number);



        }

        if (originalNUm== reverse){
//           return true;
//            System.out.println("original numer is :" + originalNUm + " is a palindrom");
            return true;
        }
        else {
//            System.out.println("original number" + originalNUm + " IS NOT A palindrom");
            return false;
        }



        // comparse the two
    }


    public static boolean stringPalindrome(String wordOfChoice){
        String str = wordOfChoice, reverseStr ="";

        int strLength = str.length();

        for (int i = (strLength - 1); i>= 0; --i){
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            return true;
        } else {
            return false;
        }


    }
}
