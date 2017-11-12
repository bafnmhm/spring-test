package cn.mit.service;


import org.springframework.stereotype.Service;

@Service("myMovieLister")
public class SimpleMovieLister
{
    public String say()
    {
        return "in SimpleMovieLister!!";
    }
}
