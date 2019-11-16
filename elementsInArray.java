package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int [] numbers = {2, 6, 8, 3, 9, 15, 27, 30, 21, 47, 102};
        System.out.print("Input the number: ");
        checkElement(numbers);
        
    }


    public static void checkElement(int[] i){
        boolean elementInArray = false;
        Scanner input =new Scanner(System.in);
        int answer = input.nextInt();
        for(int j = 0; j < i.length; j++){
            if(answer == i[j]){
                elementInArray = true;
                break;
            }

        }
        if(elementInArray){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

}

