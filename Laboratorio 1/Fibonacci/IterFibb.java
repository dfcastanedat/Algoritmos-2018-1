package iterfibb;
import java.math.BigInteger;

public class IterFibb {
    //Byte
    static byte ByteFibIt(byte n) {
        byte x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = (byte) (x + y);
        }
        return x;
    }
    //Int
    static int IntFibIt(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
    //Float
    static float FloatFibIt(float n) {
        float x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
    //Double
    static double DoubleFibIt(double n) {
        double x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
    //Short
    static short ShortFibIt(short n) {
        short x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = (short) (x + y);
        }
        return x;
    }
    //Long
    static long LongFibIt(long n) {
        long x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }
    //Short
    static short LongFibIt(short n) {
        short x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = (short) (x + y);
        }
        return x;
    }
    //BigInteger
    static BigInteger BigFibIt(BigInteger n){
        BigInteger zero = null;
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("1");
        BigInteger result2;
        if (n.equals(zero)==true) {
            result2=null;
        } else {
            for (BigInteger i = new BigInteger("1");i.compareTo(n)<0;i=i.add(BigInteger.ONE)){
                y=x.add(y);
                x=y.subtract(x);
            }
            result2=y;
        }
        return result2;
    }
    public static void main(String[] args) {
    byte n = 11;
    short n1 = 23;
    int n2 = 46;
    long n3 = 92;
    BigInteger n4 = new BigInteger("1000");
        System.out.println(ByteFibIt(n)); //límite sin overflow en n=11
        System.out.println(ShortFibIt(n1)); //límite sin overflow en n=23
        System.out.println(IntFibIt(n2)); //límite sin overflow en n=46
        System.out.println(LongFibIt(n3));//límite sin overflow en n=92
        System.out.println(BigFibIt(n4));//límite sin overflow en n=No hay, no existe   
        }
    }

    

