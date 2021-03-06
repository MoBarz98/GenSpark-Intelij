import java.util.Scanner;

public class PlayGame {
    private int rand;
    private int guessCount;
    private int playerGuess;
    private String name;
    private boolean isCorrect = false;

    Scanner scanner = new Scanner(System.in);

    // Constructor
    PlayGame() {

    }
public static String numberGuess(int secretNumber, int guess){
        if (secretNumber == guess){
            return "Good Job!";
        }
        if (secretNumber > guess){
            return "your guess is too low";
        }
        return "your guess is too high";
}
    // GETTERS
    public int getRand() {
        return rand;
    }
    public int getGuessCount() {
        return guessCount;
    }
    public String getName() {
        return name;
    }
    public int getPlayerGuess() {
        return playerGuess;
    }
    public boolean getIsCorrect() {
        return isCorrect;
    }
    // SETTERS
    public void setRand(int rand) {
        this.rand = rand;
    }
    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlayerGuess(int playerGuess) {
        this.playerGuess = playerGuess;
    }
    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    void Play() {
        generateRandomNumber();
        setGuessCount(0);

        System.out.println("Hello! What is your name?");

        try {
            setName(scanner.next());
            System.out.println("Well, " + getName() + ", I am thinking of a number between 1 and 20.");
        } catch (Exception e) {
            System.out.println("Type Mismatch");
        }
        System.out.println("Take a guess.");

        try {
            setPlayerGuess(scanner.nextInt());
            setGuessCount(getGuessCount() + 1);
            while (!getIsCorrect()) {
                if (getPlayerGuess() > getRand()) {
                    System.out.println("Your guess is too high");
                    System.out.println("Take a guess.");
                    setPlayerGuess(scanner.nextInt());
                    setGuessCount(getGuessCount() + 1);
                } else if (getPlayerGuess() < getRand()) {
                    System.out.println("Your guess is too low.");
                    System.out.println("Take a guess");
                    setPlayerGuess(scanner.nextInt());
                    setGuessCount(getGuessCount() + 1);
                } else if (getPlayerGuess() == getRand()) {
                    System.out.println("Good job, " + getName() + "! You guessed my number in " + getGuessCount() + " guesses!");
                    //setIsCorrect(true);
                    System.out.println("Would you like to play again? ");
                    String choice = scanner.next();
                    if (choice.equals("y") || choice.equals("Y")) {
                        Play();
                    } else if (choice.equals("n") || choice.equals("N")) {
                        System.out.println("Thank you for playing!");
                        setIsCorrect(true);
                    }
                }
                if (getGuessCount() > 6) {
                    PrintGameOver();
                    //System.out.println("Game Over!  Too many attempts!");
                    //break;
                    System.out.println("Play again? (Y/N)");
                    String choice = scanner.next();
                    if (choice.equals("y") || choice.equals("Y")) {
                        Play();
                    } else if (choice.equals("n") || choice.equals("N")) {
                        System.out.println("Thank you for playing!");
                        break;
                        //setIsCorrect(true);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Type Mismatch");
        }

    }

    void generateRandomNumber() {
        setRand((int) (Math.random() * 20));
    }

    void PrintGameOver() {
        System.out.println("Game Over!  Too many attempts!");
    }
}