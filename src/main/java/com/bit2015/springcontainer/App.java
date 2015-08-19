package com.bit2015.springcontainer;

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
    	ApplicationContext ac =
    			new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
        System.out.println( "Hello World!" );
    }
}
