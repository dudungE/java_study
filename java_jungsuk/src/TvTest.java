class Tv1 {
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUP() {++channel;}
    void channelDown() {--channel;}
}

public class TvTest {
    public static void main(String args[]) {
        Tv1 t;
        t = new Tv1();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다");
    }
}


//현재 채널은 6입니다
