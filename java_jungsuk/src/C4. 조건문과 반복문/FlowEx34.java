import java.util.*;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:
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

            for(;;) {
                System.out.print("걔산할 값 입력(종료:0 전체종료:99)");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;
                if (num == 99)
                    break outer;
                switch (menu) {
                    case 1:
                        System.out.println("reslult=" + num*num);
                        break;
                    case 2:
                        System.out.println("reslult=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("reslult=" + Math.log(num));
                        break;

                }


            }

        }

    }
}

//(1) square
//(2) square root
//(3) log
//원하는 메뉴(1~3) 선택(종료: 0)>>
//2
//걔산할 값 입력(종료:0 전체종료:99)9
//reslult=3.0
//걔산할 값 입력(종료:0 전체종료:99)