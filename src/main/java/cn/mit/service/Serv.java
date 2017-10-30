package cn.mit.service;

import cn.mit.lib.Foo;
import cn.mit.lib.SubFoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

@Component
public class Serv
{
    private Foo foo;

    private SubFoo subFoo;

    private String bar;

    private String p1;

    private String p2;

    private Map<String, String> adminEmails;

    @Autowired
    public Serv(Foo foo, String bar, SubFoo subFoo)
    {
        this.foo = foo;
        this.bar = bar;
        this.subFoo = subFoo;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("run in init @annotation");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("run in destroy @annotation");
    }

    public String getTestString()
    {
        return foo.say();
    }

    public Foo getFoo()
    {
        return foo;
    }

    public void setFoo(Foo foo)
    {
        this.foo = foo;
    }

    public String getP1()
    {
        return p1;
    }

    public void setP1(String p1)
    {
        this.p1 = p1;
    }

    public String getBar()
    {
        return bar;
    }

    public void setBar(String bar)
    {
        this.bar = bar;
    }

    public String getP2()
    {
        return p2;
    }

    public void setP2(String p2)
    {
        this.p2 = p2;
    }

    public SubFoo getSubFoo()
    {
        return subFoo;
    }

    public void setSubFoo(SubFoo subFoo)
    {
        this.subFoo = subFoo;
    }

    public Map<String, String> getAdminEmails()
    {
        return adminEmails;
    }

    public void setAdminEmails(Map<String, String> adminEmails)
    {
        this.adminEmails = adminEmails;
    }
}
