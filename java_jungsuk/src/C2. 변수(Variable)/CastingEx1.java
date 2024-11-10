public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int)d;

        System.out.println("score="+score); //85
        System.out.println("d="+d); // 85.4 형변환 이후에도 피연산자에는 영향x
    }
}



//score=85
//d=85.4
