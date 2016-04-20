//Troy Egar
//February 19,2016
//lab04 Card Generator
//After you generate a random number, create two String variables: a String corresponding to the name of the suit and a String corresponding to the identity of the card.
//Use if statements to assign the suit name.
//Use a switch statement to assign the card identity.
//Print out the name of the randomly selected card.
public class CardGenerator{
  //creates class
  public static void main(String[] args) {
      //Picks a random card
      int randomCard = (int) (Math.random()*52)+1;
      //Creating String Variables
      String Suit = "";
      String Card = "";
      int cardVal = 0;
      
      //Assigning Strings a suit based on number
      if(randomCard<=13)
      {
        cardVal = randomCard;
        Suit = "Diamonds";
      }
      else if(randomCard>13 && randomCard<=26){
        Suit = "Clubs";
        cardVal = randomCard-13;
      }
      else if (randomCard>26 && randomCard<=39){
        Suit = "Hearts";
        cardVal = randomCard-26;
      }
      else if (randomCard>39 && randomCard<=52){
        Suit = "Spades";
        cardVal = randomCard-39;
      }
      
      //Using switch statements to assign identity of card
      
      switch (cardVal) {
        
        case 1 : Card = "Ace";
                 break;
        case 2 : Card = "2";
                 break;
        case 3 : Card = "3";
                 break;
        case 4 : Card = "4";
                 break;
        case 5 : Card = "5";
                 break;
        case 6 : Card = "6";
                 break;
        case 7 : Card = "7";
                 break;
        case 8 : Card = "8";
                 break;
        case 9 : Card = "9";
                 break;
        case 10 : Card = "10";
                 break;
        case 11 : Card = "Jack";
                 break;
        case 12 : Card = "Queen";
                 break;
        case 13 : Card = "King";
                 break;
      }
                 
        //Print Statements 
        System.out.println("You picked the"+" " +Card+" "+ "of" +" "+ Suit);
  }
}
      
      
      
      
      
      

