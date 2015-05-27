/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Diego Fernández Godoy
 */
@Entity
public class Baja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigoBaja;
    private String motivo;
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    //getters and setters
    
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    public Integer getCodigoBaja() {
        return codigoBaja;
    }

    public void setCodigoBaja(Integer codigoBaja) {
        this.codigoBaja = codigoBaja;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoBaja != null ? codigoBaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof Baja)) {
            return false;
        }
        Baja other = (Baja) object;
        if ((this.codigoBaja == null && other.codigoBaja != null) || (this.codigoBaja != null && !this.codigoBaja.equals(other.codigoBaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "JPA.Baja[ id=" + codigoBaja + " ]";
    }
    //Relacion Muchos a uno entre Baja y Tecnico
    @ManyToOne
    private Baja baja;

    public Baja getBaja() {
        return baja;
    }

    public void setBaja(Baja baja) {
        this.baja = baja;
    }
    
}
