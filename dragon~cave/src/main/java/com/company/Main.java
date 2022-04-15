package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        Scanner Dragon = new Scanner(System.in);
        int answer = 0;
        String ERROR = "pick either 1 or 2";
        try {
            int x = Integer.parseInt(Dragon.nextLine());
            if (x == 1) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and shouts FOOD");
                System.out.println("gobbles you down in one bite");
            }

            if (x == 2) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("You see a friendly dragon");
                System.out.println("He invites you for a cup of coffee");
                System.out.println("You have a good time");
            }
            if (x != 1 && x != 2) {
                System.out.println(ERROR);
            }}catch(NumberFormatException e) {
                System.out.println(ERROR);
            }
        }

    public static String caveChoice(String userInput) {
        if (userInput.equals("1")) {
            return "you die";
        }
        if (userInput.equals("2")) {
            return "you still die";
    }
    return "you live";
    }
}

