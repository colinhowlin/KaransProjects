import java.math.BigDecimal;

public class FindPi{
    //BigDecimal representation of the number 355
    private final static BigDecimal THREE_FIVE_FIVE = new BigDecimal(355.0);
    //BigDecimal representation of the number 113
    private final static BigDecimal ONE_ONE_THREE = new BigDecimal(113.0);

    //return pi with default scale of 10
    public static BigDecimal getPi(){
        return THREE_FIVE_FIVE.divide(ONE_ONE_THREE, 10, BigDecimal.ROUND_DOWN);
    }
    
    //return pi to given number of digits
    //throws exception if !(0 < scale <= 100)
    public static BigDecimal getPi(int scale) throws IllegalArgumentException{        
        if (scale > 0 && scale <= 100){
            return THREE_FIVE_FIVE.divide(ONE_ONE_THREE, scale, BigDecimal.ROUND_DOWN);            
        } else {
            throw new IllegalArgumentException("scale must be positive integer less than 100");
        }
    }
}