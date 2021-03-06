/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Rubencito
 */

@Entity

public class Recurso implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tipo;
    private String descripcion;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Recurso{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }
    @ManyToMany
    @JoinTable(name = "rec_int",
            joinColumns = @JoinColumn(name = "recursos_fk"),
            inverseJoinColumns = @JoinColumn(name= "intervencion_fk"))
    private List<Intervencion> recursoAintervencion;

    public List<Intervencion> getRecursoAintervencion() {
        return recursoAintervencion;
    }

    public void setRecursoAintervencion(List<Intervencion> recursoAintervencion) {
        this.recursoAintervencion = recursoAintervencion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.tipo);
        hash = 23 * hash + Objects.hashCode(this.descripcion);
        hash = 23 * hash + Objects.hashCode(this.recursoAintervencion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.recursoAintervencion, other.recursoAintervencion)) {
            return false;
        }
        return true;
    }
    
    
    
}
