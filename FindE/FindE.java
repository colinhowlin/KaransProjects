import java.math.BigDecimal;

public class FindE{
    //bigDecimal representation of the number 10000
    private final static BigDecimal TEN_THOUSAND = new BigDecimal(10000);
    
    /* Calculate e using formula (1+1/n)^n
     * where n = 10000
     * Calculated to default scale of 10 decimal places
    */
    public static BigDecimal getE(){
        BigDecimal x = (BigDecimal.ONE.add(BigDecimal.ONE.divide(TEN_THOUSAND, 10, BigDecimal.ROUND_DOWN)));        
        BigDecimal y = x.pow(10000);
        return y.setScale(10, BigDecimal.ROUND_DOWN);
    }
    
    /* Calculate e using formula (1+1/n)^n
     * where n = 10000
     * Calculated to scale decimal places
    */
    public static BigDecimal getE(int scale) throws IllegalArgumentException{   
        if (scale > 0 && scale <= 100){
            BigDecimal x = (BigDecimal.ONE.add(BigDecimal.ONE.divide(TEN_THOUSAND, 10, BigDecimal.ROUND_DOWN)));        
            BigDecimal y = x.pow(10000);
            return y.setScale(scale, BigDecimal.ROUND_DOWN);
        } else {
            throw new IllegalArgumentException("scale must be positive integer less than 100");
        }
    }
}