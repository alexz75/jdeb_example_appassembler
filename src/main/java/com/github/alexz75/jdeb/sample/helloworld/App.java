package com.github.alexz75.jdeb.sample.helloworld;

import java.util.ResourceBundle;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger log=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        String helloMsg=ResourceBundle.getBundle("msg").getString("hello.msg");
        log.debug("Here we're talking with world!");
        System.out.println(helloMsg);
    }
}
