public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int->byte] i=%d -> b=%d%n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int->byte] i=%d -> b=%d%n", i, b);
        // [int->byte] i=300 -> b=44 값손실 발생

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

        System.out.println("i="+Integer.toBinaryString(i));
        // i=11111111111111111111111111111110
    }
}



//[int->byte] i=10 -> b=10
//[int->byte] i=300 -> b=44
//[byte -> int] b=10 -> i=10
//[byte -> int] b=-2 -> i=-2
//i=11111111111111111111111111111110