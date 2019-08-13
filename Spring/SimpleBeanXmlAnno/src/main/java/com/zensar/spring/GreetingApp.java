package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class GreetingApp 
{
    public static void main( String[] args )
    {
       
        ApplicationContext ctx=new ClassPathXmlApplicationContext("Greetings.xml");
        Greeting greeting=ctx.getBean("Festival",Greeting.class);
        System.out.println(greeting.sayGreet());
    }
}
