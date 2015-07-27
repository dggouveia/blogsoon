/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon;

import br.edu.ifpb.bdnc.blogsoon.entidades.AppConfig;
import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import br.edu.ifpb.bdnc.blogsoon.entidades.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Main implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

    @Autowired
    UsuarioRepository UsuarioRepository;
    
    @Override
    public void run(String... strings) throws Exception {
        UsuarioRepository.save(new Usuario());
        
    }
    
    
}
