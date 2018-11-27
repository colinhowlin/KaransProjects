import java.math.BigDecimal;
import java.util.Scanner;

public class FindPiTest{
    private final static Scanner input = new Scanner(System.in);
    private static BigDecimal pi;
    
    public static void main(String[] args){    
        System.out.print("Please enter the number of digits to represent Pi to (1-100): ");
        int scale = input.nextInt();
        
        try {
            pi = FindPi.getPi(scale);
            System.out.println("BigDecimal Pi: " + pi);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }        
    }
}