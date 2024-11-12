public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
//        char c2 = c1 + 1;   //incompatible types: possible lossy conversion from int to char
          char c2 = 'a' + 1;
//          char c2 = (char)('a' + 1);
        System.out.println(c2);
    }
}


//b
