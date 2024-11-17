import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("주민번호 입력(011231-1111222>");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("you man");
                break;
            case '2': case '4':
                System.out.println("you girl");
                break;
            default:
                System.out.println("unvalid number");
        }

      }
}


//주민번호 입력(011231-1111222>110101-21112222
//you girl
