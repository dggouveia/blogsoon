/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon.dao;

import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public interface UsuarioDAOIF extends CrudRepository<Usuario, Long>{
    
}
