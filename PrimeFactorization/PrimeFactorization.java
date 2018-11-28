import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactorization{
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.print("Please enter a number: ");
        int num1 = input.nextInt();
        
        ArrayList<Integer> factors = findFactors(num1);
                
        System.out.println("Prime factors of " + num1 + ":");
        for (int factor : factors){
            if (isPrime(factor)){
                System.out.print(factor + ", ");      
            }
        }
    }
    
    public static ArrayList<Integer> findFactors(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                factors.add(i);
            }
        }        
        return factors;
    }
    
    public static boolean isPrime(int n){
        if (n <= 3){
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6){
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }        
        return true;
    }
}