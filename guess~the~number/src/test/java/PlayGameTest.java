import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class PlayGameTest {
    @Test
     void numberGuess(){
        var x = new PlayGame();
        assertEquals("your guess is too high", PlayGame.numberGuess(5,6));
        assertEquals("your guess is too low", PlayGame.numberGuess(5,4));
        assertEquals("Good Job!", PlayGame.numberGuess(5,5));
    }

}
