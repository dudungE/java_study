public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작");;
        firstMethod();
        System.out.println("main(String[] args)이 종료");;
    }

    static void firstMethod() {
        System.out.println("firstMethod이 시작");;
        secondMethod();
        System.out.println("firstMethod이 종료");;
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작");;
//        System.out.println("secondMethod()");
        System.out.println("secondMethod()이 종료");;
    }
}


//main(String[] args)이 시작
//firstMethod이 시작
//secondMethod()이 시작
//secondMethod()이 종료
//firstMethod이 종료
//main(String[] args)이 종료