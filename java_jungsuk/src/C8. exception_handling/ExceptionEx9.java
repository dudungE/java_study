class ExceptionEx9 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("test error.");
            throw e;	 // 예외를 발생시킴
            //  throw new Exception("고의로 발생시켰음.");  <- 한줄로 표현한 코드 

        } catch (Exception e)	{
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
