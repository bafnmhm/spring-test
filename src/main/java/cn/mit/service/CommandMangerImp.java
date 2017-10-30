package cn.mit.service;

import cn.mit.lib.Command;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandMangerImp implements ApplicationContextAware
{
    private ApplicationContext applicationContext;

    public void process()
    {
        Command command = createCommand();
        System.out.println(command);
        command.setState("run");
        command.execute();
    }

    public void init() {
        System.out.println("init in init func()");
    }

    private Command createCommand() {
        return this.applicationContext.getBean("myCommand", Command.class);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext()
    {
        return applicationContext;
    }
}
