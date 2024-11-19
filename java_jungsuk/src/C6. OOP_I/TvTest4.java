class Tv4 {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDown() {--channel;}
}

public class TvTest4 {
    public static void main(String args[]) {
        Tv4[] tvArr = new Tv4[3];

        for(int i=0;i<tvArr.length;i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10;
        }

        for(int i=0;i< tvArr.length;i++) {
            tvArr[i].channelUP();
            System.out.printf("tvARr[%d].channel=%d%n", i, tvArr[i].channel);
        }

    }
}


//tvARr[0].channel=11
//tvARr[1].channel=12
//tvARr[2].channel=13
