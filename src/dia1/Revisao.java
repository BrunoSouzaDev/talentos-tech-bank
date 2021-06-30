package dia1;

public class Revisao {
    public static void main(String[] args) {
        short s = 123;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        double d2 = 1000000000.00;
//        fazer um CAST "forçar a conversão"
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;

        System.out.println(s2);
    }
}
