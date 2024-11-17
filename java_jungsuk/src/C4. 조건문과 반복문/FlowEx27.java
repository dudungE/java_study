import java.util.*;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input num for sum(terminate - input 0)");

        while (flag) {
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }

        System.out.println("Sum: " + sum);


    }
}

//input num for sum(terminate - input 0)
//>>100
//>>200
//>>300
//>>400
//>>0
//Sum: 1000