/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.bdnc.blogsoon.entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Emanuel Batista da Silva Filho - emanuelbatista2011@gmail.com
 */
public class Teste {
    private static EntityManager entityManager=Persistence.createEntityManagerFactory("br.edu.ifpb.bdnc.blogsoon_blogsoon-core_jar_1.0-SNAPSHOTPU").createEntityManager();
   
    public static void main(String[] args) {
        Usuario usuario=new Usuario();
        usuario.setNome("Oii");
        salvar(usuario);
        entityManager.close();
        
    }
    
    public static void salvar(Object o){
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(o);
        entityTransaction.commit();
    }
    
    
}
