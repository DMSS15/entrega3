/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Administrativo;
import JPA.JefeServicio;
import JPA.Tecnico;
import JPA.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Salvador
 */
@Stateless
public class ActualizarUsuarioImp implements ActualizarUsuarioLocal{
    @PersistenceContext(unitName= "Entrega2-ejbPU")
    private EntityManager em;

    @Override
    public Usuario getUsuario(String dni) {
        
        Usuario u = em.find(Administrativo.class, dni);
        if(u!=null) return u;
        
        u = em.find(JefeServicio.class, dni);
        if(u!=null) return u;
        
        u = em.find(Tecnico.class, dni);
        if(u!=null) return u;
        
        
        return null;
    }

    @Override
    public void actualizarUsuario (Usuario u) {
        em.merge(u);
    }
    
    
    
}
