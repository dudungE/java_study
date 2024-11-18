class Data2 { int x; }


class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main () : x = " + d.x);

        change(d);
        System.out.println("After chang(d)");
        System.out.println("main () : x = " + d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("chnage() : x = " + d.x);
    }
}


//main () : x = 10
//chnage() : x = 1000
//After chang(d)
//main () : x = 1000