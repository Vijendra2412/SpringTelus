package org.vjcoder;

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

        ApplicationContext context =  new ClassPathXmlApplicationContext("spring.xml");  //ApplicationContext:- its provide all the features of BeanFactory
/*  //1
        Alien obj  = new Alien();
        obj.code();

 */

        /*
        //2.//getbean give the object from the container

        Alien obj = (Alien) context.getBean("alien");
        obj.code();
         */

        /*
        //3.
        Alien obj = (Alien) context.getBean("alien1");
        obj.code();
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();
         */

        /*
        //4.
        Alien obj = (Alien) context.getBean("alien1");
        obj.age=12;
        System.out.println(obj.age);
//        obj.code();

        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj.age);
//        obj1.code();

         */

       /*
        //5
        //comment all code

        Alien obj = (Alien) context.getBean("alien1");
        obj.age=12;
        System.out.println(obj.age);
//        obj.code();

        Alien obj1 = (Alien) context.getBean("alien1");
        System.out.println(obj.age);
//        obj1.code();

        */

        /*
        //6 setter injection
        Alien obj = (Alien) context.getBean("alien1");
        obj.setAge(12);
        System.out.println(obj.getAge());
        obj.code();

         */

        //6.1 setter injection
        Alien obj = (Alien) context.getBean("alien1");
//        obj.setAge(12);
        System.out.println(obj.getAge());
        obj.code();




    }
}
