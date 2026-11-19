package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("The given number is zero");
        }else if(number < 0){
            System.out.println("The given number is negative.");
        }else{
            System.out.println("The given number is positive");
        }
    }
}