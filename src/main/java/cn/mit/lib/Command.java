package cn.mit.lib;

public class Command
{
    private String state;

    public void execute()
    {
        System.out.println("execute in command!");
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
}
