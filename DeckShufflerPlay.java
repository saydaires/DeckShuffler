package com.mycompany.deckshuffler;
public class DeckShufflerPlay {
    public static void main(String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards(); // creating a new 52-cards deck
        myDeckOfCards.shuffle(); // shuffling the cards of this deck
        
        for(int index = 0; index < 52; index++)
        {
            System.out.printf("%-19s", myDeckOfCards.dealCard()); // deal out the 52 cards from deck
            if(index % 4 == 0)
                System.out.println(); // line break for every four cards dealt 
        }
    }
}
