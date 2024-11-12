import java.util.*;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("input number(ex: 1 2 3 4 5)>>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum = %3d num = %d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합: " + sum);
    }
}

//input number(ex: 1 2 3 4 5)>>123145
//sum =   5 num = 123145
//sum =   9 num = 12314
//sum =  10 num = 1231
//sum =  13 num = 123
//sum =  15 num = 12
//sum =  16 num = 1
//각 자리수의 합: 16
