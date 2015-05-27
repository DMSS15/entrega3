/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Rubencito
 */
@Stateless
public class PerfilImp implements PerfilLocal {
 @PersistenceContext(unitName = "Entrega2-ejbPU")
private EntityManager em;    
    @Override
    public void modificarDatos( Usuario u) {
       em.merge(u);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
