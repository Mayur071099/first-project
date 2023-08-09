package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num;
        System.out.println("Enter a year");
        num = scan.nextLine();

        String Reminder;
        Reminder = "num/4";


        if (Reminder.equals("[1>=2|2<=3]"))
        {System.out.println("Year is not leaf year") ;

        } else
        { System.out.println("Year is a leaf year");}
    }
}