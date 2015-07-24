package br.edu.ifpb.bdnc.blogsoon.servicos;

import br.edu.ifpb.bdnc.blogsoon.dao.UsuarioRepository;
import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@Named
public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioRepository repositorio;

    @Inject
    public void setRepositorio(UsuarioRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    @Override
    public void salvar(Usuario usuario) {
        repositorio.save(usuario);
    }

}
