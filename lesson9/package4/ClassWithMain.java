package lesson9.package4;
import lesson9.package1.A;
import lesson9.package2.B;
import lesson9.package3.C;

public class ClassWithMain {
    private final String name = "John";
    private final int age = 40;
    private final String bloodType = "B rh-";

    public static void main(String[] args) {
        System.out.println("From other classes");
        A a = new A();
        B b = new B();
        C c = new C();
        a.sing();
        b.speak();
        c.speak();
        //with private methods
        System.out.println("With private methods");
        ClassWithMain cl = new ClassWithMain();
        System.out.println(cl.name);
        System.out.println(cl.age);
        System.out.println(cl.bloodType);
    }
}
