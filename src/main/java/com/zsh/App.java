package com.zsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = "com.zsh")
@MapperScan(basePackages = "com.zsh.mapper")
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )

    {
        SpringApplication.run(App.class,args);
    }
}
