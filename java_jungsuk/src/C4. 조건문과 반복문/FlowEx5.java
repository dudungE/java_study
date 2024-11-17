import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수 입력>>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("your score is %d.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if  (score > 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            }
            else if (score < 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("your grade is %c%c.%n", grade, opt);


      }
}


//your score is 95.
//your grade is A0.
