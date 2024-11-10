public class CharTocode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
    }
}


//A=65(0X41)
//가=44032(0XAC00)