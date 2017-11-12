package cn.mit.lib;

import org.springframework.stereotype.Component;

@Component
public class Bar
{
    public final String label = "BAR LABEL";

    public Bar()
    {

    }

    public String say(String x, String y)
    {
        return "in bar! " + x + " " + y;
    }
}
