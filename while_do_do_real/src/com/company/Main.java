package com.company;

public class Main {
//
    public static void main(String[] args) {
//// //	 write your code here
        int count =1 ;
//        while(count != 6){
//            System.out.println("Count value is " + count );
//            count ++;
//
//        }
//
//        for (int i = 6; i!=6; i++){
//            System.out.println("Count value is :" + count );
//        }
//        count = 1 ;
//        while(true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is : " + count);
//            count ++;
//        }
//        count = 1;
        do {
            System.out.println("Count value was : " + count);
            count ++;
            if (count > 100){
                break;
            }
        } while (count!= 6);
//
//
//
//
//
//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
////                break;
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }



        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
//                break;
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbersFound ++;
            if (evenNumbersFound >= 5){
                break;
            }


        }
        System.out.println("Total Even Numbers Found: "+ evenNumbersFound);

    }



    public static boolean isEvenNumber(int number){
        if((number % 2) ==0){
            return true;
        } else {
            return false;
        }
    }
}
