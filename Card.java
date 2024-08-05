//package com.mycompany.deckshuffler;
public class Card {
    private final String face; // face of instance Card;
    private final String suit; // suit of instance Card;
    
    public Card(String cardFace, String cardSuit) // Card instance constructor;
    {
        this.face = cardFace;
        this.suit = cardSuit;
    }
    
    public String toString() // return the Card instance from toString method;
    {
        return face + " of " + suit;
    }
}