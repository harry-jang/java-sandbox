package com.sage.exam3;

public class StaticApp {
    public static void main (String[] args) {
        System.out.println(Foo.classVar);
        // System.out.println(Foo.instanceVar); // ERROR

        Foo.classMethod();
        // Foo.instanceMethod(); // ERROR

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        f1.classVar = "changed by f1";

        System.out.println(Foo.classVar);
        System.out.println(f2.classVar);

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);

    }
}

class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";

    public static void classMethod() {
        System.out.println(classVar); // OK
        // System.out.println(instanceVar); // ERROR : Non-static field 'instanceVar' cannot be referenced from a static context
    }

    public void instanceMethod() {
        System.out.println(classVar); // OK
        System.out.println(instanceVar); // OK
    }
}
