import java.util.Scanner;

public class NextPrime{
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        boolean again = true;        
        int number = 1;
        System.out.println("Prime Numbers");

        while (true){
            System.out.print("Get next prime? 1 for yes: ");
            int answer = input.nextInt();
            if (answer == 1){
                int prime = nextPrime(number);
                System.out.println(prime);
                number = prime + 1;
            } else {
                break;
            }
        }
    }
    
    public static int nextPrime(int num){
        while (!isPrime(num)) {
            num++;
        }        
        return num;
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