package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the amount of houses you would like");
        System.out.println(matchHouse());
    }

    public static int matchHouse() {
        Scanner input = new Scanner(System.in);
        int houseAmount = input.nextInt();
        if (houseAmount > 0) {
            return (houseAmount * 5) + 1;
        }
        else{
            return(0);
        }
    }
}