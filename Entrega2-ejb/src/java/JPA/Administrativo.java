/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
//@DiscriminatorValue("ADMINISTRATIVO")
public class Administrativo extends Usuario {

    private static final long serialVersionUID = 1L;

    private String despacho;

    //Relacion muchos a muchos entre Ciudadano Adminsitrativo
    @ManyToMany(mappedBy = "administativoAciudadano")
    private List<Ciudadano> administrativoPORciudadano;

    @Override
    public String toString() {
        return "Administrativo{" + "despacho=" + despacho + '}';
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public List<Ciudadano> getAdministrativoPORciudadano() {
        return administrativoPORciudadano;
    }

    public void setAdministrativoPORciudadano(List<Ciudadano> administrativoPORciudadano) {
        this.administrativoPORciudadano = administrativoPORciudadano;
    }
    
     //equal y hascode eredado de Usuario

}
