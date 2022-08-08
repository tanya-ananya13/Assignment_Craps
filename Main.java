package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String YNResponse = "";
        boolean done = false;
        int point = 0;

        do
        {
            System.out.println("Are you ready to play Craps? Let's roll! \n");
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("The result is: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("Craps! You've lost the game! Game over. \n");
            }
            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Natural. You've won!");
            }
            else
            {
                System.out.println("You have made The Point. You need to roll again! \n");
                crapsRoll = point;

                while (crapsRoll != 7)
                {
                    int die3 = rnd.nextInt(6) + 1;
                    int die4 = rnd.nextInt(6) + 1;
                    int otherRoll = die3 + die4;
                    System.out.println("The result is: " + otherRoll);

                    if (crapsRoll == otherRoll)
                    {
                        System.out.println("You win! Your point was: " + crapsRoll + " and your new roll was: " + otherRoll );
                        break;
                    }
                    else
                    {
                        crapsRoll = otherRoll;
                        die3 = rnd.nextInt(6) + 1;
                        die4 = rnd.nextInt(6) + 1;
                        otherRoll = die3 + die4;
                    }
                    if (otherRoll == 7)
                    {
                        System.out.println("Craps! You lose. Your result was: " + otherRoll);
                        break;
                    }
                }
            }

            System.out.println("Do you want to play again [Y/N]: ");
            YNResponse = in.nextLine();

            if (YNResponse.equalsIgnoreCase("N")) {
                done = true;
            }

        } while(!done);
    }
}
