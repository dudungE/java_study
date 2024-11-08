public class FolatEx1 {
    public static void main(String[] args) {
        float f = 9.12345679801234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.1234567890123456789d;

        System.out.printf("     123456789012345678901234%n");   // 소수점 이하 6자리까지출력(%f의 기본)
        System.out.printf("f    :  %f%n", f);
        System.out.printf("f : %24.20f%n", f);
        System.out.printf("f2 : %24.20f%n", f2);
        System.out.printf("d : %24.20f%n", d);

    }
}
