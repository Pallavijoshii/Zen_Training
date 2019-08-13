package com.zensar.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class SpringApp 
{
    public static void main( String[] args )
    {
       ApplicationContext ct = new ClassPathXmlApplicationContext("greeting.xml");
       
       Greeting g1 = ct.getBean("birthday", Greeting.class);
       System.out.println(g1.sayGreet());
       
       Greeting g2 = ct.getBean("holi", Greeting.class);
       System.out.println(g2.sayGreet());
    
       Greeting g3 = ct.getBean("birthday",Greeting.class);
    }
}