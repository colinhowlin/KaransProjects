public class Fibonacci{
    public static void main(String[] args){
        //x(n) = x(n - 1) + x(n - 2)
        
        //System.out.print(fib(5));
        
        int numberOf = 10;
        
        for (int i = 1; i <= numberOf; i++) {

            System.out.print(fib(i)+" ");
        }
        
        
        
    }
    
    public static int fib(int num){
        
        if (num == 1 || num == 2) {
            return 1;
        }
        
        return fib(num - 1) + fib(num - 2);
    }
}