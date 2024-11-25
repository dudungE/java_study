class DefaultMEthodTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();

    }
}

class Child extends Parent implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in child");
    }
}

class Parent {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("method1() in Myinterface");
    }

    default void method2() {
        System.out.println("method2() in Myinterface");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in Myinterface");
    }
}


interface MyInterface2 {

    default void method1() {
        System.out.println("method1() in Myinterface2");
    }

    static void staticMethod() {
        System.out.println("staticMethod() in Myinterface2");
    }
}
