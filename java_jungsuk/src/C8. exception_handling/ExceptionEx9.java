class ExceptionEx9 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("test error.");
            throw e;	 // ���ܸ� �߻���Ŵ
            //  throw new Exception("���Ƿ� �߻�������.");  <- ���ٷ� ǥ���� �ڵ� 

        } catch (Exception e)	{
            System.out.println("���� �޽��� : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("���α׷��� ���� ����Ǿ���.");
    }
}
