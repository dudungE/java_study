public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("scr.charAt(" + i + "):" + ch);
        }
        char[] chArr = src.toCharArray();

        System.out.println(chArr);

    }
}


//scr.charAt(0):A
//scr.charAt(1):B
//scr.charAt(2):C
//scr.charAt(3):D
//scr.charAt(4):E
//ABCDE