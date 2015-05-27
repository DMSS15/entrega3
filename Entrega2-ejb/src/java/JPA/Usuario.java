/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author María y Salva
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "disc", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("USUARIO")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    
    private int codigo;
    
    @Id
    private String dni;
    private String password;
    private String centro;
    private String nombre;
    private String apellidos;
    private String sexo;
    private String nacionalidad;
    private String direccion;
    @Temporal(TemporalType.DATE)
    private Date nacimiento;
    private String correo;
    private String telefono;

   
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTfijo(int tfijo) {
        this.tfijo = tfijo;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTfijo() {
        return tfijo;
    }

    public String getMovil() {
        return movil;
    }
    private int tfijo;
    private String movil;

    public int getCodigo() {
        return codigo;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.codigo;
        hash = 59 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad + ", direccion=" + direccion + ", nacimiento=" + nacimiento + ", correo=" + correo + ", tfijo=" + tfijo + ", movil=" + movil + '}';
    }

    
    
}
