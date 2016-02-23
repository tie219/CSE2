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
        Suit = Diamond;
      }
      else if(randomCard<=26)
      {
        Suit = "Clubs";
        cardVal = randomCard-13;
      }
      
      
      if (randomCard == 1){
        Suit = "Diamond";
      }
      else if (randomCard == 2){
        Suit = "Diamond";
      }
      else if (randomCard == 3){
        Suit = "Diamond";
      }
      else if (randomCard == 4){
        Suit = "Diamond";
      }
      else if (randomCard == 5){
        Suit = "Diamond";
      }
      else if (randomCard == 6){
        Suit = "Diamond";
      }
      else if (randomCard == 7){
        Suit = "Diamond";
      }else if (randomCard == 8){
        Suit = "Diamond";
      }
      else if (randomCard == 9){
        Suit = "Diamond";
      }
      else if (randomCard == 10){
        Suit = "Diamond";
      }
      else if (randomCard == 11){
        Suit = "Diamond";
      }
      else if (randomCard == 12){
        Suit = "Diamond";
      }
      else if (randomCard == 13){
        Suit = "Diamond";
      }
      else if (randomCard == 14){
        Suit = "club";
        randomCard - 13;
      }
      else if (randomCard == 15){
        Suit = "club";
      }
      else if (randomCard == 16){
        Suit = "club";
      }
      else if (randomCard == 17){
        Suit = "club";
      }
      else if (randomCard == 18){
        Suit = "club";
      }
      else if (randomCard == 19){
        Suit = "club";
      }
      else if (randomCard == 20){
        Suit = "club";
      }
      else if (randomCard == 21){
        Suit = "club";
      }
      else if (randomCard == 22){
        Suit = "club";
      }
      else if (randomCard == 23){
        Suit = "club";
      }
      else if (randomCard == 24){
        Suit = "club";
      }
      else if (randomCard == 25){
        Suit = "club";
      }
      else if (randomCard == 26){
        Suit = "club";
      }
       else if (randomCard == 27){
        Suit = "heart";
      }
        else if (randomCard == 28){
        Suit = "heart";
      }
        else if (randomCard == 29){
        Suit = "heart";
      }  
      else if (randomCard == 30){
        Suit = "heart";
      } 
      else if (randomCard == 31){
        Suit = "heart";
      } 
      else if (randomCard == 32){
        Suit = "heart";
      }  
      else if (randomCard == 33){
        Suit = "heart";
      } 
      else if (randomCard == 34){
        Suit = "heart";
      }  
      else if (randomCard == 35){
        Suit = "heart";
      } 
      else if (randomCard == 36){
        Suit = "heart";
      } 
      else if (randomCard == 37){
        Suit = "heart";
      }
        else if (randomCard == 38){
        Suit = "heart";
      }
        else if (randomCard == 39){
        Suit = "heart";
      }
      else if (randomCard == 40){
        Suit = "spades";
      }
      else if (randomCard == 41){
        Suit = "spades";
      }
      else if (randomCard == 42){
        Suit = "spades";
      }
      else if (randomCard == 43){
        Suit = "spades";
      }
      else if (randomCard == 44){
        Suit = "spades";
      }
      else if (randomCard == 45){
        Suit = "spades";
      }
      else if (randomCard == 46){
        Suit = "spades";
      }
      else if (randomCard == 47){
        Suit = "spades";
      }
      else if (randomCard == 48){
        Suit = "spades";
      }
      else if (randomCard == 49){
        Suit = "spades";
      }
      else if (randomCard == 50){
        Suit = "spades";
      }
      else if (randomCard == 51){
        Suit = "spades";
      }
      else if (randomCard == 52){
        Suit = "spades";
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
        System.out.println("You picked the" +Card+ "of" +Suit);
  }
}
      
      
      
      
      
      

