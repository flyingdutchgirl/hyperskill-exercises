import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        BigInteger c = new BigInteger(sc.next());
        BigInteger d = new BigInteger(sc.next());
        
        
        BigInteger result = a.negate().multiply(b).add(c).subtract(d);
        
        System.out.println(result);
        
    }
}
