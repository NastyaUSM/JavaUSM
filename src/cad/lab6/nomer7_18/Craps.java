package cad.lab6.nomer7_18;

import java.security.SecureRandom;

public class Craps {

    //create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();
    //constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private int rollNumber = 0;

    //roll dice, calculate sum and display results
    public static int rollDice() {
        //pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); //first die roll
        int die2 = 1 + randomNumbers.nextInt(6); //second die roll

        int sum = die1 + die2;  // sum of die values

        return sum;
    }

    //plays one game of craps
    public GameResult play() {
        int myPoint = 0; //point if not win or loss on first roll
        Status gameStatus;  //can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); //first roll of the dice

        //determine game status and point based on first roll
        switch (sumOfDice) {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: //win with 11 on first roll
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //lose with 2 on first roll
            case TREY: //lose with 3 on first roll
            case BOX_CARS: //lose with 12 on first roll
                gameStatus = Status.LOST;
                break;
            default: //did not win or lose, so remember point
                gameStatus = Status.CONTINUE;  //game is not over
                myPoint = sumOfDice; //remember the point
                break;
        }
        rollNumber = rollNumber + 1;

        //while game is not complete
        while (gameStatus == Status.CONTINUE) //not WON or LOST
        {
            sumOfDice = rollDice(); //roll dice again

            //determine game status
            if (sumOfDice == myPoint) //win by making point
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN) //lose by rolling 7 before point
                gameStatus = Status.LOST;

            rollNumber = rollNumber + 1;
        }

        return new GameResult(gameStatus, rollNumber);

    }//end of main

    //enum type with constants that represent the game status
    public enum Status {CONTINUE, WON, LOST}

    public class GameResult {
        private Status status;
        private int rollNumber;

        public GameResult(Status status, int rollNumber) {
            this.status = status;
            this.rollNumber = rollNumber;
        }

        public Status getStatus() {
            return status;
        }

        public int getRollNumber() {
            return rollNumber;
        }
    }

}//end of Craps