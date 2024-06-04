import java.util.Random;
import java.util.Scanner;

class RandomNumberGuess
{
    public void RandomNumberGuessing()
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain) 
        {
            int randomNumber = random.nextInt(101);
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("I've picked a random number between 1 and 100. Can you guess it?");

            while (!guessedCorrectly && attempts < maxAttempts) 
            {
                System.out.println("Enter your guess:");
                try 
                {
                    int userGuess = sc.nextInt();
                    attempts++;

                    if (userGuess == randomNumber) 
                    {
                        System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                        guessedCorrectly = true;
                    } 
                    else if (userGuess < randomNumber) 
                    {
                        System.out.println("Too low. Try again.");
                    } 
                    else 
                    {
                        System.out.println("Too high. Try again.");
                    }
                } 
                catch (Exception e) 
                {
                    System.out.println("Please enter a valid number between 1 and 100.");
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry, you've reached the maximum attempts. The number was: " + randomNumber);
            }

            System.out.println("Do you want to play again? (Enter 1 for yes, 2 for no)");
            int playChoice = sc.nextInt();
            if (playChoice != 1) 
            {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}

public class NumberGame 
{
    public static void main(String[] args) 
    {
        RandomNumberGuess obj = new RandomNumberGuess();
        obj.RandomNumberGuessing();
    }
}
