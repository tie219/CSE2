//Troy Egar
//HW02 Arithmetic program
//February 7,2016
//calculate the following:
//Total cost of each kind of item (i.e. total cost of pants, etc)
//Sales tax charged buying all of each kind of item (i.e. sales tax charged on belts)
//Total cost of purchases (before tax)
//Total sales tax
//Total paid for this transaction, including sales tax. 

public class Arithmetic{
  //creates class
  public static void main(String[] args) {

//Input data

//Number of pairs of pants
int numPants = 3;
//Cost per pair of pants
double pantsPrice = 34.98;
//Number of sweatshirts
int numShirts = 2;
//Cost per shirt
double shirtPrice = 24.99;
//Number of belts
int numBelts = 1;
//cost per box of envelopes
double beltCost = 33.99;
//the tax rate
double paSalesTax = 0.06;

//

//Cost of purchases before tax:
double BeforeTaxPants = (numPants * pantsPrice);
//Cost of Pants before tax
double BeforeTaxShirts = (numShirts * shirtPrice);
//Cost of Shirts before tax
double BeforeTaxBelts = (numBelts * beltCost);
//Cost of Belts before tax

//Total Cost
double totalCostofPants = ((BeforeTaxPants * paSalesTax)+(BeforeTaxPants));
//Total cost of pants with tax
double totalCostofShirts = ((BeforeTaxShirts * paSalesTax)+(BeforeTaxShirts));
//Total cost of shirts with tax
double totalCostofBelts = ((BeforeTaxBelts * paSalesTax)+(BeforeTaxBelts));
//Total cost of belts with tax

//Sales Tax on Items
double PantsSalesTax = (totalCostofPants - BeforeTaxPants);
//Gives tax on pants
double ShirtsSalesTax = (totalCostofShirts - BeforeTaxShirts);
//Gives tax on Shirts
double BeltsSalesTax = (totalCostofBelts - BeforeTaxBelts);
//Gives tax on Belts

//Total Sales Tax
double SalesTaxTotal = (PantsSalesTax + ShirtsSalesTax + BeltsSalesTax);

//Before Tax Transaction total
double Btaxtotal = (BeforeTaxPants + BeforeTaxShirts + BeforeTaxBelts);

//Transaction total
double TransactionTotal = (totalCostofPants+totalCostofShirts+totalCostofBelts);

//Conversions to two decimals:
//Individual Items
double NewPants = Math.round(totalCostofPants*100)/100.0;
double NewShirts = Math.round(totalCostofShirts*100)/100.0;
double NewBelts = Math.round(totalCostofBelts*100)/100.0;

//Sales on individual items
double NewPantsSale = Math.round(PantsSalesTax*100)/100.0;
double NewShirtsSale = Math.round(ShirtsSalesTax*100)/100.0;
double NewBeltsSale = Math.round(BeltsSalesTax*100)/100.0;

//Total cost before tax
double NewBeforeTaxtotal = Math.round(Btaxtotal * 100)/100.0;

//Total Sales Tax
double NewSalesTaxTotal = Math.round(SalesTaxTotal*100)/100.0;

//Transaction Total
double NewTransaction = Math.round(TransactionTotal*100)/100.0;

//End Conversions


//Print results
     System.out.println("Total cost of pants is "+NewPants+" dollars");
     System.out.println("Total cost of shirts is "+NewShirts+" dollars");
     System.out.println("Total cost of belts is "+NewBelts+" dollars");
     System.out.print("Sales tax on pants is ");
     System.out.printf("%.2f",NewPantsSale ); 
     System.out.print(" dollars");
     System.out.print("\n");
     System.out.print("Sales tax on shirts is ");
     System.out.printf("%.2f",NewShirtsSale ); 
     System.out.print(" dollars");
     System.out.print("\n");
     System.out.println("Sales tax on belts is "+NewBeltsSale+" dollars");
     System.out.println("Transaction total before tax is "+NewBeforeTaxtotal+" dollars");
     System.out.println("The total sales tax is "+NewSalesTaxTotal+" dollars");
     System.out.println("The transaction total is "+NewTransaction+" dollars");
     
}
}







