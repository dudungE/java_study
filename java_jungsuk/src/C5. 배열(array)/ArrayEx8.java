public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;

        int temp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for (int i = 0; i < 6; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}


//ball[0]=39
//ball[1]=21
//ball[2]=32
//ball[3]=5
//ball[4]=16
//ball[5]=33