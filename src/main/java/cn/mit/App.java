package cn.mit;

import cn.mit.lib.Foo;
import cn.mit.lib.SubFoo;
import cn.mit.service.Serv;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static void test1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Serv serv = context.getBean("serv", Serv.class);
        Serv aliasServ = context.getBean("aliasServ", Serv.class);

        System.out.println(serv.toString());
        System.out.println(aliasServ.toString());

        System.out.println(serv.getTestString());
        System.out.println(serv.getP1());
        System.out.println(serv.getP2());
        System.out.println(serv.getAdminEmails());
    }

    public static void test2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Foo foo1 = context.getBean("foo", Foo.class);
//        System.out.println(foo1);

//        SubFoo foo = context.getBean("subFoo", SubFoo.class);
//        System.out.println(foo.say());
    }
}
