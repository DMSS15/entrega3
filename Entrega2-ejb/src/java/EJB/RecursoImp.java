/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Recurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author María y Salva
 */
@Stateless
public class RecursoImp implements RecursoLocal{
 @PersistenceContext(unitName="Entrega2-ejbPU")
     private EntityManager em;
    @Override
    public Error insertar(Recurso r) {
       Recurso recurso= em.find(Recurso.class, r.getTipo());
        if (recurso != null)
        {
            //  la demanda ya existe
            return Error.RECURSO_REPETIDO;
        }
        
        em.persist(r);
        
        return Error.NO_ERROR;  
    }

    @Override
    public Error modificar(Recurso r) {
         Recurso recurso = em.find(Recurso.class, r.getTipo());
        if (recurso == null)
        {
            //  la demanda ya existe
            return Error.RECURSO_INEXISTENTE;
        }
        
        em.persist(r);
        
        return Error.NO_ERROR;    
    }

    @Override
    public Error eliminar(Recurso r) {
        Recurso recurso = em.find(Recurso.class, r.getTipo());
        if (recurso == null)
        {
            // la demanda ya existe
            return Error.RECURSO_INEXISTENTE;
        }
        
        em.persist(r);
        
        return Error.NO_ERROR;    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
