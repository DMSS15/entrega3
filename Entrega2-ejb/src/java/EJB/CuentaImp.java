/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Administrador;
import JPA.Administrativo;
import JPA.Ciudadano;
import JPA.JefeServicio;
import JPA.Tecnico;
import JPA.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juan Carlos
 */
@Stateless
public class CuentaImp implements CuentaLocal{
    @PersistenceContext(unitName = "Entrega2-ejbPU")
    private EntityManager em;
    
    @Override
    public Usuario login(String dni, String password) {
 
        Usuario u=(Usuario)em.find(Administrativo.class, dni);
        
        if(u!=null && u.getDni().equals(dni)){
            return u;
        }
        
        u=(Usuario)em.find(Administrador.class, dni);
        
        if(u!=null && u.getDni().equals(dni)){
            return u;
        }
         u=(Usuario)em.find(JefeServicio.class, dni);
        
        if(u!=null && u.getDni().equals(dni)){
            return u;
        }
         u=(Usuario )em.find(Tecnico.class, dni);
        
        if(u!=null&& u.getDni().equals(dni)){
            return u;
        }
      
          u=(Usuario )em.find(Ciudadano.class, dni);
        
        if(u!=null&& u.getDni().equals(dni)){
            return u;
        }
        return null;
        
    }
    
}
