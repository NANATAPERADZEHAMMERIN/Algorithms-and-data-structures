package com.company;
public class Main {

    public static void main(String[] args) {
        int [] num = {2, 10, 30, 45, 21, 37, 68, 102};
        int x = 45;
        int answer = searchNumber(num, x);
        if(answer == -1){
            System.out.println("Number is not present in array");
        }else {
            System.out.println("The index of the number is: " + answer);
        }
    }

    public static int searchNumber(int [] num, int x) {

        for(int i = 0; i < num.length; i++){
            if(x == num[i]){
                return  i;
            }

        }
        return -1;
    }
}
