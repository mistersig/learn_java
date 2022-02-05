package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String Value = "A";
        switch (Value){
            case "A":
                System.out.println("A was found");
                break;
            case "B":
                System.out.println("B was found");
                break;
            case "c": case "d":
                System.out.println("c or d was found");
                break;
            default:
                System.out.println("not found");
                break;

        }
    }


}
