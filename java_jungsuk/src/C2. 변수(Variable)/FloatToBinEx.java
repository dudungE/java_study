public class FloatToBinEx {
    public static void main(String args[]) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f);

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); // 16진수로출력
     }
}


//9.123457
//4111F9AE