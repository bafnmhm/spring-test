package cn.mit.lib;

public class Foo
{
    private static Foo foo = new Foo();

    private Foo()
    {

    }

    public static Foo createInstance()
    {
        System.out.println("in Foo createInstance()");
        return foo;
    }

    public SubFoo createSubFooInstance()
    {
        System.out.println("in Foo createSubFooInstance()");
        return new SubFoo();
    }

    public String say()
    {
        return "return from foo";
    }
}
