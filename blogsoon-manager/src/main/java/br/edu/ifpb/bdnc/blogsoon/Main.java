/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon;
import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import javax.inject.Inject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */


/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@SpringBootApplication
public class Main implements CommandLineRunner{
    
    @Inject
    br.edu.ifpb.bdnc.blogsoon.dao.UsuarioRepository usuarioRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        Usuario usuario=new Usuario();
        usuario.setNome("sdsd");
        usuario.setLogin("sds");
        usuario.setSobrenome("sds");
        usuario.setSenha("sdd");
        System.out.println(usuarioRepository.save(usuario));
    }
}
