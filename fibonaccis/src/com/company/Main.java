package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 10;
        long[] fib = generateFibonacci(n);
        for (int i = 0; i < n; ++i ){
//            System.out.println(Long.toUnsignedString(fib[i]) + " ");
        }

    }

    public static long[] generateFibonacci(int n){
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;
//        System.out.println(fib);
//        System.out.println(Long.toUnsignedString(fib[0]) );
        for (int i = 2; i < n; ++i){
//            System.out.println(Long.toUnsignedString(fib[i]));
            fib[i] = fib[i - 2] + fib[ i - 1];
            System.out.println(i);
        }
        return fib;
    }
}
