import java.util.ArrayList;

public class CardExperiment {
    public static void main(String[] args) {
        // Datatype  variable name   calling the constructor and passing in System.in
        //Scanner       keyboard = new Scanner(System.in);
        Card          aceOfSpades = new Card("ace","spades");
        Card          jesseOfMid = new Card("five","Hearts");

//        jesseOfMid.setSuit("hearts"); //valid
//        jesseOfMid.setSuit("Diamonds");
        System.out.printf("%s is a %s card with a value of %d %n", aceOfSpades, aceOfSpades.getCardColour(), aceOfSpades.getFaceValue());
        System.out.printf("%s is a %s card%n", jesseOfMid, jesseOfMid.getCardColour());

        // toString
        System.out.println(jesseOfMid);
        System.out.println(aceOfSpades);



        // why we put datatype's into our List
        // any type can go
        ArrayList genericArrayList = new ArrayList();
        genericArrayList.add(1234);
        genericArrayList.add("Friend");
        genericArrayList.add(aceOfSpades);
        for (int i = 0; i < genericArrayList.size(); i++)
            System.out.println(genericArrayList.get(i).getClass());




        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(aceOfSpades);
        cardArrayList.add(jesseOfMid);
        //cardArrayList.add("Friend"); can't

        for (Card card : cardArrayList)
            System.out.println(card.getFaceName());


        // create an instance of DeckOfCards
        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck);
    }
}
