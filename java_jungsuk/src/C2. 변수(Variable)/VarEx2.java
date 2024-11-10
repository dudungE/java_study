//변수 swap

public class VarEx2 {
    public static void main(String[] agrs) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + "\ny:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("\nafter\nx:" + x + "\ny:" + y);

    }
}


//x:10
//y:20
//
//after
//x:20
//y:10
