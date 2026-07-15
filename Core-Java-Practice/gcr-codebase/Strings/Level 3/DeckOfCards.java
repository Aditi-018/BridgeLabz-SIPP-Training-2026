import java.util.*;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {
                "Hearts","Diamonds",
                "Clubs","Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7",
                "8","9","10",
                "Jack","Queen",
                "King","Ace"
        };

        String[] deck = new String[52];

        int k=0;

        for(String suit:suits) {
            for(String rank:ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }

        List<String> cards =
                Arrays.asList(deck);

        Collections.shuffle(cards);

        for(int i=0;i<5;i++) {
            System.out.println(cards.get(i));
        }
    }
}