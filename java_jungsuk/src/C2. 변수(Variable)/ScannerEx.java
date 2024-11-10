import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수 입력");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num=%d%n", num);
    }
}


//두자리 정수 입력22
//입력내용 : 22
//num=22