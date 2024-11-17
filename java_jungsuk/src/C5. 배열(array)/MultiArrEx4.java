import java.util.*;

class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"interger", "정수"},
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++) {
            System.out.printf("Q%d. %s의 뜼은?", i+1, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다. %n%n");
            } else {
                System.out.printf("오답입니다. 정답은 %s입니다 %n%n", words[i][1]);
            }
        }

    }
}


//Q1. chair의 뜼은?의자
//정답입니다.
//
//Q2. computer의 뜼은?컴퓨터
//정답입니다.
//
//Q3. interger의 뜼은?wjdtn
//오답입니다. 정답은 정수입니다

