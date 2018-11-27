import java.util.Scanner;
import java.math.BigDecimal;

public class FindETest{
    private final static Scanner input = new Scanner(System.in);
    private static BigDecimal e;
    
    public static void main(String[] args){
        System.out.print("Please enter the number of digits to represent e to(0-100): ");
        int scale = input.nextInt();
        
        try {
            e = FindE.getE(scale);
            System.out.println("BigDecimal e: " + e);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}