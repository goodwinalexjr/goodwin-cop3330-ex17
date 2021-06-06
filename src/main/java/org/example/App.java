package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.print("What is the users weight? ");
        String w = numbers.nextLine();
        if(!w.matches("[0-9]+")){
            while(!w.matches("[0-9]+")){
                System.out.println("Invalid number");
                System.out.print("What is the users weight? ");
                w = numbers.nextLine();
            }
        }
        System.out.print("What is the users sex 1 for male 2 for female? ");
        String s = numbers.nextLine();
        if(!s.matches("[1-2]")){
            while(!s.matches("[1-2]")){
                System.out.println("Invalid number");
                System.out.print("What is the users sex 1 for male 2 for female? ");
                s = numbers.nextLine();
            }
        }
        System.out.print("What is the total alcohol consumed in ounces? ");
        String a = numbers.nextLine();
        if(!s.matches("[0-9]+")){
            while(!s.matches("[0-9]+")){
                System.out.println("Invalid number");
                System.out.print("What is the total alcohol consumed in ounces? ");
                a = numbers.nextLine();
            }
        }
        System.out.print("How long has it been since your last drink? ");
        String t = numbers.nextLine();
        if(!s.matches("[0-9]+")){
            while(!s.matches("[0-9]+")){
                System.out.println("Invalid number");
                System.out.print("How many hours has it been since your last drink? ");
                t = numbers.nextLine();
            }
        }


        double weight = Double.parseDouble(w);
        int sex = Integer.parseInt(s);
        double alcohol = Double.parseDouble(a);
        double time = Double.parseDouble(t);
        double bac = 0;

        if(sex == 1){
            bac = ((alcohol * 5.14)/(weight * .73)) - .015 * time;

        }
        else{
            bac = ((alcohol * 5.14)/(weight * .66)) - .015 * time;

        }
        System.out.println("Your BAC is " + bac + ".");
        if(bac > .08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
