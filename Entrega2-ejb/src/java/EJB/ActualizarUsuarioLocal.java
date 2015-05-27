/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

import JPA.Usuario;
import javax.ejb.Local;

/**
 *
 * @author Salvador
 */
@Local
public interface ActualizarUsuarioLocal {
     
    public Usuario getUsuario(String dni);
    public void actualizarUsuario(Usuario u);
    
    
}
