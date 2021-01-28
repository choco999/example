import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName;
    private String suit;

    /**
     * This constructor takes 2 arguments, one for the face name and
     * one for the sut. The value of the card assumes that aces
     * are high and will dynamically establish the card value
     * when the getCardValue() method is run
     *
     */

    public Card(String faceName, String suit){
        this.faceName = faceName;
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid. Use of of " + validSuits);
    }

    public String toString(){
        return faceName + " of " + suit;
    }
}
