public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < numArr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < numArr.length -1; j++) {
                if (numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed) break;

            for (int k = 0; k < numArr.length; k++)
                System.out.print(numArr[k]);
            System.out.println();
        }

    }
}


//3549511412
//3455114129
//3451141259
//3411412559
//3114124559
//1131244559
//1112344559