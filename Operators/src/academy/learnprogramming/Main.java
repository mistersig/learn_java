package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult =  " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult =  " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        boolean isAlien  = false;
        if (isAlien == true) {
            System.out.println("It is not an alien!");

            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("You got the high score!");
        }




        double myVar = 20.0;
        double mySecond = 80.00;

        double newVar = myVar + mySecond;
        System.out.println(newVar);
        double remainder = newVar % mySecond;
        System.out.println(newVar % mySecond);


        boolean varCheck = (remainder > 0)? true: false;
        String output = (varCheck)? "Got some remainder": "no remainder";
        System.out.println(output);




    }
}
