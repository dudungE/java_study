class Data { int x; }


class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main () : x = " + d.x);

        change(d.x);
        System.out.println("After chang(d.x)");
        System.out.println("main () : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("chnage() : x = " + x);
    }
}


//main () : x = 10
//chnage() : x = 1000
//After chang(d.x)
//main () : x = 10