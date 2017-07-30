package com.mrscottmcallister.singleton;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by scottmcallister on 2017-07-29.
 */
public class CardDeckSingleton {
    private static CardDeckSingleton instance = null;

    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private LinkedList<String> cardList = initCardList();

    private CardDeckSingleton() {}

    public static CardDeckSingleton getInstance() {
        // protect instance from being initialized multiple times in separate threads
        synchronized (CardDeckSingleton.class) {
            if (instance == null) {
                instance = new CardDeckSingleton();
                shuffleCards();
            }
        }
        return instance;
    }

    public LinkedList<String> getCardList() {
        return instance.cardList;
    }

    public LinkedList<String> drawCards(int numberToDraw) {
        LinkedList<String> cardsToReturn = new LinkedList<String>();
        for (int i = 0; i < numberToDraw; i++) {
            cardsToReturn.add(instance.cardList.remove(0));
        }
        return cardsToReturn;
    }

    public void putBackCards(LinkedList<String> cardsToPutBack) {
        for (int i = 0; i < cardsToPutBack.size(); i++) {
            instance.cardList.add(cardsToPutBack.get(i));
        }
    }

    public static void shuffleCards() {
        Collections.shuffle(instance.cardList);
    }

    private LinkedList<String> initCardList() {
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < faceValues.length; j++) {
                String newCard = faceValues[j] + " of " + suits[i];
                list.add(newCard);
            }
        }
        return list;
    }
}
