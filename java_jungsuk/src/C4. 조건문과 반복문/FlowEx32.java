import java.util.*;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴(1~3) 선택(종료: 0)>>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴 잘못선택 하셨어요(종료는 0)");
                continue;
            }


            System.out.println("선택하신 메뉴는" + menu + "번 입니다.");



        }

    }
}

//(1) square
//(2) square root
//(3) log
//원하는 메뉴(1~3) 선택(종료: 0)>>
//2
//선택하신 메뉴는2번 입니다.
//(1) square
//(2) square root
//(3) log
//원하는 메뉴(1~3) 선택(종료: 0)>>
//1
//선택하신 메뉴는1번 입니다.
//(1) square
//(2) square root
//(3) log
//원하는 메뉴(1~3) 선택(종료: 0)>>
//0
//프로그램 종료