package AbstractClasses;

public class accessAbstractClass extends AbstractClass {
    public static void main(String[] args) {
        staticMethod();
        AbstractClass obj = new accessAbstractClass();
        obj.nonabstractMethod();
    }

    @Override
    void test() {

    }
}
