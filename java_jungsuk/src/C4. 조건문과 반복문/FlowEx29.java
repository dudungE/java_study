public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i = %d ", i);

            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
                    System.out.print("짝!");
            } while ((tmp/=10) != 0);

            System.out.println();
        }
    }
}

//i = 1
//i = 2
//i = 3 짝!
//i = 4
//i = 5
//i = 6 짝!
//        ...
//i = 97 짝!
//i = 98 짝!
//i = 99 짝!짝!
//i = 100