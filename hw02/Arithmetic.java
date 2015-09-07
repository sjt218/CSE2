//Salvador Joshua Tarun III
//Arithmetic Program
//
//Compile program first
//Use javac Arithmetic.java in the command prompt
//Run the program
//Uses java Arithmetic

//Define a class
public class Arithmetic{
   
    // Add main method
    public static void main(String[] args) {
        //Number of pairs of socks
        double nSocks = 3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$ = 2.58;
        
        //Number of drinking glasses
        double nGlasses = 6;
        //Cost per glass
        double glassCost$ = 2.29;
        
        //Number of boxes of envelopes
        double nEnvelopes = 1;
        //Cost per box of envelopes
        double envelopeCost$ = 3.25;
        
        //Tax on total cost
        double taxPercent = .06;
        
        
        //Obtains total cost of all items including tax
        double priceSocks = (nSocks * sockCost$) * (1 + taxPercent);
        double priceGlasses = (nGlasses * glassCost$) * (1 + taxPercent);
        double priceEnvelopes = (nEnvelopes * envelopeCost$) * (1 + taxPercent);
        
        //Converts priceSocks, priceGlasses, and priceEnvelopes into integers
        int priceSocksInt = (int) priceSocks;
        int priceGlassesInt = (int) priceGlasses;
        int priceEnvelopesInt = (int) priceEnvelopes;
        
        //Combination of these two processes cuts off decimal to two points
        priceSocksInt *= 100.00;
        priceGlassesInt *= 100.00;
        priceEnvelopesInt *= 100.00;
        
        priceSocksInt /= 100.00;
        priceGlassesInt /= 100.00;
        priceEnvelopesInt /= 100.00;
        
        //Obtains total cost overall
        double priceTotalTax = priceSocks + priceGlasses + priceEnvelopes;
        
        int priceTotalTaxInt = (int) priceTotalTax;
        priceTotalTaxInt *= 100.00;
        priceTotalTaxInt /= 100.00;
        
        //Obtains total cost without tax
        double priceTotal = priceTotalTax / (1 + taxPercent);
        
        int priceTotalInt = (int) priceTotal;
        priceTotalInt *= 100.00;
        priceTotalInt /= 100.00;
        
        //Sales tax
        double salesTotalTax = priceTotalTax - priceTotal;
        int salesTotalTaxInt = (int) salesTotalTax;
        salesTotalTaxInt *= 100.00;
        salesTotalTaxInt /= 100.00;
        
        
        System.out.println("You bought " + nSocks + " socks. Each one costs $" + sockCost$ + ".");
        System.out.println("The total for this type of item is $" + priceSocksInt + ".");
        
        System.out.println("You bought " + nGlasses + " glasses. Each one costs $" + glassCost$ + ".");
        System.out.println("The total for this type of item is $" + priceGlassesInt + ".");
        
        System.out.println("You bought " + nEnvelopes + " envelopes. Each one costs $" + envelopeCost$ + ".");
        System.out.println("The total for this type of item is $" + priceEnvelopesInt + ".");
        
        System.out.println("The total price of your items was $" + priceTotalInt + ". $" + salesTotalTaxInt + " was added as sales tax.");
        System.out.println("Your total cost today is $" + priceTotalTaxInt + ". ");
        
    }  
}