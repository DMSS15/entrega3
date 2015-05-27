/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;


import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import javax.persistence.OneToMany;

/**
 *
 * @author María y Salva
 */
@Entity
//@DiscriminatorValue("JEFESERVICIO")
public class JefeServicio extends Usuario {

    private static final long serialVersionUID = 1L;

    private String despacho;
    private String especialidad;

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "JefeServicio{" + "despacho=" + despacho + '}';
    }

    //Relación de Uno a Mucho
    @OneToMany(mappedBy = "jefeservicio")
    private List<Tecnico> tecnicos;

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(List<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

     //equal y hascode eredado de Usuario
}
