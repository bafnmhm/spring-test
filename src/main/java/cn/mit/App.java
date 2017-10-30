package cn.mit;

import cn.mit.lib.Command;
import cn.mit.lib.Foo;
import cn.mit.lib.SubFoo;
import cn.mit.service.CommandManger;
import cn.mit.service.CommandMangerImp;
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

//        CommandManger commandManger = context.getBean("commandManager", CommandManger.class);
//        commandManger.process();
//        commandManger.process();
//        commandManger.process();

        CommandMangerImp commandMangerImp = context.getBean("commandMangerImp", CommandMangerImp.class);
        commandMangerImp.process();
        commandMangerImp.process();
        commandMangerImp.process();

        Command command1 = context.getBean("myCommand", Command.class);
        Command command2 = context.getBean("myCommand", Command.class);
        Command command3 = context.getBean("myCommand", Command.class);

        System.out.println(command1);
        System.out.println(command2);
        System.out.println(command3);
    }
}
