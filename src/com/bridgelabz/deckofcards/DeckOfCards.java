package com.bridgelabz.deckofcards;

import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {
    public static void main(String[] args) {
        String[][] cardCombo = new String[4][13];
        String[][] player = new String[4][9];
        Set<String> cards  = new HashSet<String>();
        int a = 0, b = 0, c = 0, d = 0, num = 1;

        String[] suits  = {"Diamond", "Heart", "Spade", "Club"};
        String[] rank  = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen","King", "Ace" };

        // Create Combination of Cards
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                cardCombo[i][j] = suits[i] + rank[j];
            }
        }
        //Distribute 9 Cards Each to 4 Players
        while(num <=36){
            int randomSuit = (int) Math.floor(Math.random()*10) % 4;
            int randomNum = (int) Math.floor(Math.random()*100) % 13;

            // Avoid Duplicate of Cards
            if (cards.add(cardCombo[randomSuit][randomNum])) {
                int option = num % 4;
                switch (option){
                    case 0:
                        player[option][a++] = cardCombo[randomSuit][randomNum];
                        break;
                    case 1:
                        player[option][b++] = cardCombo[randomSuit][randomNum];
                        break;
                    case 2:
                        player[option][c++] = cardCombo[randomSuit][randomNum];
                        break;
                    case 3:
                        player[option][d++] = cardCombo[randomSuit][randomNum];
                        break;
                }
                num++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + (i+1) + " : ");
            for (int j=0; j < 9; j++) {
                System.out.print(player[i][j] + " ");
            }
            System.out.println();
        }

    }
}

