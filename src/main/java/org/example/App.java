package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factry=new AnnotationConfigApplicationContext(AppConfig.class);

        Samsung samsung=factry.getBean(Samsung.class);
        samsung.config();
    }
}
