package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    //we can do that without @Bean tag & using @Component and @ComponentScan(basePackages = "org.example")
//    @Bean
//    public Samsung getPhone()
//    {
//        return new Samsung();
//    }
//    @Bean
//    public MobileProcessor getPrcessor()
//    {
//        return new SnapDragon();
//    }
}
