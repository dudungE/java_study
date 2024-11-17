import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        System.out.println("(Answer is)" + answer);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("input Integer between 1 to 100>>");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("try again smaller int.>>");
            } else if (input < answer) {
                System.out.println("try again bigger int.>>");
            }

        } while (input != answer);
        System.out.println("Answer!");
    }
}

//(Answer is)64
//input Integer between 1 to 100>>55
//try again bigger int.>>
//input Integer between 1 to 100>>88
//try again smaller int.>>
//input Integer between 1 to 100>>77
//try again smaller int.>>
//input Integer between 1 to 100>>64
//Answer!