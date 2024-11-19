class Data14 { int x; }

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data14 d = new Data14();
        d.x = 10;

        Data14 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data14 copy(Data14 d) {
        Data14 tmp = new Data14();
        tmp.x = d.x;

        return tmp;
    }
}


//d.x = 10
//d2.x = 10