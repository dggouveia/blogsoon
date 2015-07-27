package br.edu.ifpb.bdnc.blogsoon.blogsoon.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

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
public class Application {

    private static TemplateEngine templateEngine;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    static {
        initializeTemplateEngine();
    }

    //Thymeleaf configurations
    private static void initializeTemplateEngine() {

        ServletContextTemplateResolver templateResolver
                = new ServletContextTemplateResolver();
        templateResolver.setTemplateMode("XHTML");
        templateResolver.setPrefix("/templates/");
        templateResolver.setSuffix(".html");
        // 1 Hour
        templateResolver.setCacheTTLMs(1L);

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);

    }

    public static TemplateEngine getTemplateEngine() {
        return templateEngine;
    }
    
}
