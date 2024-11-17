public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수 :" + counter[i]);
        }

    }
}


//1233237204
//0의 개수 :1
//1의 개수 :1
//2의 개수 :3
//3의 개수 :3
//4의 개수 :1
//5의 개수 :0
//6의 개수 :0
//7의 개수 :1
//8의 개수 :0
//9의 개수 :0