import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("가위-1, 바위-2, 보-3>>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) + 1; // Math.random() 0.0이상 1.0미만범 위에 속하는 하나의 double값 반환

        System.out.println("you>" + user);
        System.out.println("com>" + com);

        switch (user - com) {
            case 2: case -1:
                System.out.println("you lose");
                break;
            case 1: case -2:
                System.out.println("you win");
                break;
            case 0:
                System.out.println("draw");
//                break;
        }


      }
}


//가위-1, 바위-2, 보-3>>2
//you>2
//com>2
//draw
