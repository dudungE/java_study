import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        char grade = ' ';
        int score = 0;

        System.out.print("input your grade(1~100)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        switch (score/10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            default :
                grade = 'F';
        }
        System.out.println("your grade is " + grade);

      }
}


//input your grade(1~100)>93
//your grade is A