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

    // constructor
    public Card(String faceName, String suit){
        setFaceName(faceName);
        setSuit(suit);
    }

    // getter for faceName
    public String getFaceName() {
        return faceName;
    }
    // getter for suit
    public String getSuit() {
        return suit;
    }




    // return List of strings
    public static List<String> getFaceNames(){
        return Arrays.asList("two","three","four","five","six","seven","eight","nine",
                "ten","jack","queen","king","ace");
    }
    public static List<String> getSuits(){
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }




    /**
     * This method will validate
     * @param faceName - this is a String to represent the name of the card
     */

    // setter with validation for faceName
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List<String> faceNames = getFaceNames();

        if (faceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid, use " + faceNames);
    }
    /**
     * This method will validate that the argument is one of "hearts","diamonds","spades","clubs"
     * @param suit
     */
    // setter with validation for suit
    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = getSuits();
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid. Use of of " + validSuits);
    }



    /**
     * This method will return the String "red" if the card's suit is heards or diamonds,
     * "black" otherwise
     * @return
     */
    public String getCardColour(){
        if (suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    /**
     * This method will return the value of the card.  2 = 2, 3=3...9=9, 10=10, jack = 11
     * queen = 12, king = 13, ace = 14
     * @return
     */
    public int getFaceValue(){
        // the first face name in the list (position 0) is "two" so we add 2 to the index(or position) of each card
        return getFaceNames().indexOf(faceName) + 2;
    }



    public String toString(){
        return faceName + " of " + suit;
    }
}
