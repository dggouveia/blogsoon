package br.edu.ifpb.bdnc.blogsoon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.edu.ifpb.bdnc.blogsoon")
@EntityScan(basePackages = "br.edu.ifpb.bdnc.blogsoon")
@SpringBootApplication
@ComponentScan(basePackages = "br.edu.ifpb.bdnc.blogsoon")
public class BlogsoonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogsoonApplication.class, args);
    }
    
}
