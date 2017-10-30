package cn.mit.service;

import cn.mit.lib.Command;

public abstract class CommandManger
{
    public void process()
    {
        Command command = createCommand();
        System.out.println(command);
        command.setState("run");
        command.execute();
    }

    // okay... but where is the implementation of this method?
    protected abstract Command createCommand();
}
