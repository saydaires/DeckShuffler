//package com.mycompany.deckshuffler;
import java.security.SecureRandom;
public class DeckOfCards {
    private Card[] deck;
    private final SecureRandom randomNumber = new SecureRandom();
    private final int NUMBER_OF_CARDS = 52;
    private int currentCard;
    
    public DeckOfCards()
    {
        String[] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;
        
        for(int index = 0; index < deck.length; index++)
        {
            deck[index] = new Card(face[index % 13], suit[index / 13]);
        }
    } // the 52-cards deck has been created
    
    public void shuffle()
    {
        currentCard = 0;
        for(int index = 0; index < deck.length; index++)
        {
            int randomCard = randomNumber.nextInt(NUMBER_OF_CARDS);
            
            Card tempCard = deck[index];
            deck[index] = deck[randomCard];
            deck[randomCard] = tempCard;
        }
    } // the 52-cards deck has been shuffled;
    
    public Card dealCard()
    {
        if(currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    } // an card of the 52-cards deck was dealt
}
