package com.company;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {
    @Test
void caveChoice(){
    assertEquals("you die", Main.caveChoice("1"));
    assertEquals("you still die", Main.caveChoice("2"));
    assertEquals("you live", Main.caveChoice("3"));
}
public static void main(String[] args) {
        var input = new Scanner(System.in);
    System.out.println("Choose 1 or 2");
    System.out.println(Main.caveChoice(input.next()));
}
}