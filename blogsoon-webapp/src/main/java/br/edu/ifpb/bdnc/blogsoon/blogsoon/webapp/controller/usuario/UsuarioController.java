package br.edu.ifpb.bdnc.blogsoon.blogsoon.webapp.controller.usuario;

import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import br.edu.ifpb.bdnc.blogsoon.servicos.UsuarioService;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    
    private UsuarioService servico;   

    @Inject
    public void setServico(UsuarioService servico) {
        this.servico = servico;
    }
    
    @RequestMapping("/salvar")
    public void salvar (Usuario usuario){
        System.out.println(usuario.getNome());
        servico.salvar(usuario);
    }

}
