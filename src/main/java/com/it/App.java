package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {

//        SpringApplication.run(App.class,args);
        SpringApplication application = new SpringApplication(App.class);
        application.setAddCommandLineProperties(true);
        application.run(args);
    }
}
