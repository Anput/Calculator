package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        //prompt user to enter numbers
        System.out.println("Welcome to Dream Corp Calculator! Type two numbers.");

        //create 3 variables to hold user numbers & operand
        int num1;
        int num2;
        String oper1;

        //assign user entered values to variables
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //prompt use to enter operand
        System.out.println("Now pick an operand!");
        oper1 = sc.next();

        //determine the operand the user entered (i.e. +, -, *, /)
        if(oper1.equals("*")){
            int answer = num1 * num2;
            //output the answer
            System.out.println(num1 + oper1 + num2 + "=" + answer);
        }else

        if(oper1.equals("+")){
            int answer = num1 + num2;
            //output the answer
            System.out.println(num1 + oper1 + num2 + "=" + answer);
        }else

        if(oper1.equals("-")){
            int answer = num1 - num2;
            //output the answer
            System.out.println(num1 + oper1 + num2 + "=" + answer);
        }else

        if(oper1.equals("/")){
            int answer = num1 / num2;
            //output the answer
            System.out.println(num1 + oper1 + num2 + "=" + answer);
        }else{
            System.out.println("You screwed up!");
        }

    }
}
