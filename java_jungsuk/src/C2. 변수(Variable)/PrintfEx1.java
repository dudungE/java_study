public class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_100_100_100L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;   // 8진수
        int hexNum = 0x10;  // 16진수
        int binNum = 0b10;  // 2진수

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); // #은 접두사(16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);

    }
}



//b=1
//s=2
//c=A, 65
//finger=[   10]
//finger=[10   ]
//finger=[00010]
//big=100100100100
//hex=0xffffffffffffffff
//octNum=10, 8
//hexNum=10, 16
//binNum=10, 2