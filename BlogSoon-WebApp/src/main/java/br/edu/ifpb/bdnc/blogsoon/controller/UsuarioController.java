/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon.controller;

import br.edu.ifpb.bdnc.blogsoon.dao.UsuarioRepository;
import br.edu.ifpb.bdnc.blogsoon.entidades.Usuario;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository UsuarioDAO;


    @ModelAttribute("usuario")
    public Usuario criarUsuario() {
        return new Usuario();
    }

    @RequestMapping("/login")
    public String login() {

        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(@Valid Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "index";
        }
        return "index";
    }

}
