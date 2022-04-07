package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String ERROR = "pick either 1 or 2";
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        Scanner Dragon = new Scanner(System.in);
        int x = Dragon.nextInt();
        Random random = new Random();
        int z = random.nextInt(2) +1;
        if (x == z) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and shouts FOOD");
            System.out.println("gobbles you down in one bite");
        }

            if (x == z) {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("You see a friendly dragon");
                System.out.println("He invites you for a cup of coffee");
                System.out.println("You have a good time");
            }
               if (x != 1 && x != 2){
                    System.out.println(ERROR);
                }
            }
    }

