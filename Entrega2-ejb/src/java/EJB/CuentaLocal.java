/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJB;

/**
 *
 * @author Juan Carlos
 */
import javax.ejb.Local;
import JPA.Usuario;
@Local
public interface CuentaLocal {
    public Usuario login(String dni, String password);

}
