import java.util.Scanner;
import java.util.ArrayList;

public class BinaryConverter{
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Please enter decimal number to convert to binary: ");
        int decimalNumber = input.nextInt();
        decimalToBinary(decimalNumber);
        
        System.out.print("Please enter binary number to convert to decimal: ");
        int binaryNumber = input.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
    }
    
    /* Method to convert given decimal number to binary.
     * Divide the number by 2.
     * Get the integer quotient for the next iteration.
     * Get the remainder for the binary digit.
     * Repeat the steps until the quotient is equal to 0.
    */
    public static void decimalToBinary(int num){
        ArrayList<Integer> binaryRep = new ArrayList<Integer>();
        
        while(num != 0){            
            int remainder = num % 2;
            binaryRep.add(0, remainder);
            num /= 2;
        }
        
        for (int bin : binaryRep){
            System.out.print(bin);
        }
    }
    
    public static int binaryToDecimal(int n){
        int decVal = 0;
        int base = 1;
        int temp = n;
        
        while (temp >= 0){
            int lastDigit = temp % 10;
            temp = temp / 10;
            decVal =+ lastDigit * base;
            base *= 2;
        }
        
        return decVal;
    }
}