import java.util.Scanner;

public class ChangeReturn{
    private static final Scanner input = new Scanner(System.in);
    private static int quarters;
    private static int dimes;
    private static int nickels;
    private static int dollars;
    
    public static void main(String[] args){        
        System.out.print("Please enter the total cost of the goods: ");
        double cost = input.nextDouble();
        int costInt = (int)(cost * 100);
        
        System.out.print("Please enter the money tendered: ");
        double tendered = input.nextDouble();
        int tenderedInt = (int)(tendered * 100);
        
        double change = tendered - cost;
        int changeInt = tenderedInt - costInt;
        
        System.out.printf("%nDollars: %d%n", getDollars(changeInt));
        changeInt -= getDollars(changeInt) * 100;
        System.out.printf("%nQuarters: %d%n", getQuarters(changeInt));
        changeInt %= 25;
        System.out.printf("%nDimes: %d%n", getDimes(changeInt));
        changeInt %= 10;      
        System.out.printf("%nNickels: %d%n", getNickels(changeInt));
        changeInt %= 5;
        System.out.printf("%nPennies: %d%n", changeInt);        
    }
    
    public static int getDollars(int change){
        return change / 100;
    }
    
    public static int getQuarters(int change){
        return change / 25;
    }
    
    public static int getDimes(int change){
        return change / 10;
    }
    
    public static int getNickels(int change){
        return change / 5;
    }
}