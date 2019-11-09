package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input the quantity of desired Fibonacci sequence: ");
        int userInput = input.nextInt();

        Fibonacci.generateFibonacciNumbers(userInput);


    }


}

class Fibonacci {

    public Fibonacci() {

    }

    static void generateFibonacciNumbers(int userInput) {

        int previous = 0;
        int doublePrevious = 0;
        for(int i = 0; i < userInput; i++){
            if(i == 0){
                doublePrevious = i;
                System.out.print(0);
            }else if (i == 1){
                previous = i;
                System.out.print(", " + 1);
            }else{
                int current = previous + doublePrevious;
                System.out.print(", " + current);
                doublePrevious = previous;
                previous = current;
            }
        }


    }
}

