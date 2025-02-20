public class FatorialTest2 {
    public static void main(String[] args) {
        int n = 21;
        long result = 0;

        for(int i = -2; i<=n;i++) {
            result = factorial(i);

            if(result==-1) {
                System.out.printf("unvalid value.(0<n<=20):%d%n", n);
                continue;
            }
            System.out.printf("%2d!=%20d%n", i, result);
        }

    }

    static long factorial(int n) {
        if (n<0 || n>20) return -1;
        if(n<=1) return 1;
        return n * factorial(n-1);
    }
}


//1!=                   1
//2!=                   2
//3!=                   6
//4!=                  24
//5!=                 120
//6!=                 720
//7!=                5040
//8!=               40320
//9!=              362880
//10!=             3628800
//11!=            39916800
//12!=           479001600
//13!=          6227020800
//14!=         87178291200
//15!=       1307674368000
//16!=      20922789888000
//17!=     355687428096000
//18!=    6402373705728000
//19!=  121645100408832000
//20!= 2432902008176640000
//unvalid value.(0<n<=20):21