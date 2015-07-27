package br.edu.ifpb.bdnc.blogsoon.entidades;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "br.edu.ifpb.bdnc.blogsoon.entidades")
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.edu.ifpb.bdnc.blogsoon.entidades"})
public class RepositoryConfig {
}
