class InnerEx2{
    class InstanceInnner {}
    static class StaticInner {}

    InstanceInnner iv = new InstanceInnner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        InstanceInner obj1 = new InstanceInnner();
        StaticInner obj2 = new StaticInner();

        InnerEx2 outer = new InnerEx2();
        InstanceInner obj1 = outer.new.InstanceInner();
    }

    void instanceMethod() {
        InstanceInner obj1 = new InstanceInnner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}