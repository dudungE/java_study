public class OperatorEx3 {
    public static void main(String[] args) {
        int i=5, j=5;
        System.out.println(i++ - ++i);  // 이런 코드는 지양(5 - 5(+1+1))
        System.out.println(i++);
        System.out.println(++j);
        System.out.printf("i = %d, j = %d", i, j);

    }
}

//-2
//5
//6
//i = 6, j = 6
