/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class TestBlackJack {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String[][] deck = new String[13][4];
        String playAgain;
        boolean continueGame = true;
        int playerCount = 0, dealerCount = 0, dealerCountForFirstRound = 0;
        int[][] card = new int[1][2];
        card[0][0] = 0;
        card[0][1] = 0;
        //Initializing the deck
        deck[0][0] = "1\u2663";
        deck[0][1] = "1\u2660";
        deck[0][2] = "1\u2666";
        deck[0][3] = "1\u2665";
        deck[1][0] = "2\u2663";
        deck[1][1] = "2\u2660";
        deck[1][2] = "2\u2666";
        deck[1][3] = "2\u2665";
        deck[2][0] = "3\u2663";
        deck[2][1] = "3\u2660";
        deck[2][2] = "3\u2666";
        deck[2][3] = "3\u2665";
        deck[3][0] = "4\u2663";
        deck[3][1] = "4\u2660";
        deck[3][2] = "4\u2666";
        deck[3][3] = "4\u2665";
        deck[4][0] = "5\u2663";
        deck[4][1] = "5\u2660";
        deck[4][2] = "5\u2666";
        deck[4][3] = "5\u2665";
        deck[5][0] = "6\u2663";
        deck[5][1] = "6\u2660";
        deck[5][2] = "6\u2666";
        deck[5][3] = "6\u2665";
        deck[6][0] = "7\u2663";
        deck[6][1] = "7\u2660";
        deck[6][2] = "7\u2666";
        deck[6][3] = "7\u2665";
        deck[7][0] = "8\u2663";
        deck[7][1] = "8\u2660";
        deck[7][2] = "8\u2666";
        deck[7][3] = "8\u2665";
        deck[8][0] = "9\u2663";
        deck[8][1] = "9\u2660";
        deck[8][2] = "9\u2666";
        deck[8][3] = "9\u2665";
        deck[9][0] = "10\u2663";
        deck[9][1] = "10\u2660";
        deck[9][2] = "10\u2666";
        deck[9][3] = "10\u2665";
        deck[10][0] = "J\u2663";
        deck[10][1] = "J\u2660";
        deck[10][2] = "J\u2666";
        deck[10][3] = "J\u2665";
        deck[11][0] = "Q\u2663";
        deck[11][1] = "Q\u2660";
        deck[11][2] = "Q\u2666";
        deck[11][3] = "Q\u2665";
        deck[12][0] = "K\u2663";
        deck[12][1] = "K\u2660";
        deck[12][2] = "K\u2666";
        deck[12][3] = "K\u2665";

        while (continueGame == true) {
        //Displaying the 52 cards in the deck
        //The ace is one point
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(deck[i][j] + " ");
            }
        }
        //Player's first turn
            card[0][0] = (int) (Math.random() * 13);
            card[0][1] = (int) (Math.random() * 4);
            if (card[0][0] >= 1 && card[0][0] <= 9) {
                playerCount = playerCount + (card[0][0] + 1);
            } else if (card[0][0] >= 10 && card[0][0] <= 13) {
                playerCount = playerCount + 10;
            }
            System.out.println("Player has " + playerCount + " number of points");
            System.out.println(deck[card[0][0]][card[0][1]]);
            System.out.println("");

            //Dealer's first turn
            card[0][0] = 0;
            card[0][1] = 0;
            card[0][0] = (int) (Math.random() * 13);
            card[0][1] = (int) (Math.random() * 4);
            if (card[0][0] >= 1 && card[0][0] <= 9) {
                dealerCountForFirstRound = dealerCountForFirstRound + card[0][0];
            } 
            else if (card[0][0] >= 10 && card[0][0] <= 13) {
                dealerCountForFirstRound = dealerCountForFirstRound + card[0][0];
            }
            
            System.out.println("Dealer has " + dealerCountForFirstRound + " number of points");
            System.out.println(deck[card[0][0]][card[0][1]]);
            System.out.println("");
        
        //The rest of the game
        while (playerCount <= 21 || dealerCount <= 21) {
            //Player's turn
            card[0][0] = (int) (Math.random() * 13);
            card[0][1] = (int) (Math.random() * 4);
            if (card[0][0] >= 1 && card[0][0] <= 9) {
                playerCount = playerCount + (card[0][0] + 1);
            } 
            else if (card[0][0] >= 10 && card[0][0] <= 13) {
                playerCount = playerCount + 10;
            }
            System.out.println("Player has " + playerCount + " number of points");
            System.out.println(deck[card[0][0]][card[0][1]]);
            System.out.println("");

            //Dealer's turn
            card[0][0] = 0;
            card[0][1] = 0;
            card[0][0] = (int) (Math.random() * 13);
            card[0][1] = (int) (Math.random() * 4);
            if (card[0][0] >= 1 && card[0][0] <= 9) {
                dealerCount = dealerCount + (card[0][0]+1);
            } 
            else if (card[0][0] >= 10 && card[0][0] <= 13) {
                dealerCount = dealerCount + card[0][0];
            }
            
            System.out.println("Dealer has " + dealerCountForFirstRound + " number of points");
            System.out.println(deck[card[0][0]][card[0][1]]);
            System.out.println("");
        }
        //End of game
        System.out.println("End of Game!!");
        System.out.println("Players Points: "+playerCount);
        System.out.println("Dealers Points: "+dealerCount);
        System.out.println("");
        
        //Results
        if (playerCount > dealerCount) {
            System.out.println("Dealer wins!");
            System.out.println("");
        }
        else if (playerCount < dealerCount) {
            System.out.println("Player wins!");
            System.out.println("");
        }
        else
            System.out.println("It's a tie!");
            System.out.println("");
        
        //Play Again?
        System.out.println("Would you like to play again?");
            playAgain = input.nextLine();
            if (playAgain.equals("Yes") || playAgain.equals("yes") || playAgain.equals("y") || playAgain.equals("Y") ) {
                continueGame = true;
            }
            else if (playAgain.equals("No") || playAgain.equals("no") || playAgain.equals("n") || playAgain.equals("N") )
                continueGame = false;
        }
    }
}
