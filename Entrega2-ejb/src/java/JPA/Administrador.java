/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
//@DiscriminatorValue("ADMINISTRADOR")
public class Administrador extends Usuario {

    private static final long serialVersionUID = 1L;

    private String despacho;

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }



    @Override
    public String toString() {
        return "Administrador{" + "despacho=" + despacho + '}';
    }

    //equal y hascode eredado de Usuario
}
