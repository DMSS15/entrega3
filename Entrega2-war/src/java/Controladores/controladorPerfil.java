package Controladores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Juan Carlos
 */

import EJB.PerfilLocal;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import JPA.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

@Named
@ManagedBean
@SessionScoped
public class controladorPerfil implements Serializable {

    @EJB
    PerfilLocal perf;
    
    private Usuario u;
    SimpleDateFormat sm =new SimpleDateFormat("dd-mm-yyyy");

    public Usuario getUsuario() {
        return u;
    }

    public void setUsuario(Usuario u) {
        this.u = u;
        perf.modificarDatos(u);
    }

    public String getNombre() {

        return u.getNombre();
    }

    public void setNombre(String nombre) {
        u.setNombre(nombre);
        perf.modificarDatos(u);
    }

    public String getApellidos() {
        return u.getApellidos();
    }
    public void setApellidos(String apellidos){
        u.setApellidos(apellidos);
        perf.modificarDatos(u);
    }

    public String getDni() {
        return u.getDni();
    }

    public void setDni(String dni) {
        this.u.setDni(dni);
        perf.modificarDatos(u);
    }

    public String getPassword() {
        return u.getPassword();
    }

    public void setPassword(String password) {
        this.u.setPassword(password);
    perf.modificarDatos(u);
    }

    public String getCentro() {
        if(u.getCentro()==null)return "--";
        return u.getCentro();
    }

    public void setCentro(String centro) {
        this.u.setCentro(centro);
        perf.modificarDatos(u);
    }

    public String getSexo() {
         if(u.getSexo()==null)return "--";
        return u.getSexo();
        
    }

    public void setSexo(String sexo) {
        this.u.setSexo(sexo);
        perf.modificarDatos(u);
        
    }

    public String getNacionalidad() {
         if(u.getNacionalidad()==null)return "--";
        return u.getNacionalidad();
    }

    public void setNacionalidad(String nacionalidad) {
        this.u.setNacionalidad(nacionalidad);
        perf.modificarDatos(u);

    }

    public String getDireccion() {
         if(u.getDireccion()==null)return "--";
        return u.getDireccion();
    }

    public void setDireccion(String direccion) {
        this.u.setDireccion(direccion);
        perf.modificarDatos(u);
    }

    public Date getNacimiento() {
        //String.valueOf(u.getNacimiento().getDay())+"/"+String.valueOf(u.getNacimiento().getMonth())+"/"+
        
        return (u.getNacimiento());
    }

    public void setNacimiento(String nacimiento) throws ParseException {
        this.u.setNacimiento(sm.parse(nacimiento));
 perf.modificarDatos(u);
    }

    public String getCorreo() {
         if(u.getCorreo()==null)return "--";
        return u.getCorreo();
    }

    public void setCorreo(String correo) {
        this.u.setCorreo(correo);
    perf.modificarDatos(u);
    }

    public String getTelefono() {
 if(u.getTelefono()==null)return "--";
        return u.getTelefono();
    }

    public void setTelefono(String telefono) {
        this.u.setTelefono(telefono);
    perf.modificarDatos(u);
    }

    public void setTelefonoFijo(int telef) {
        this.u.setTfijo(telef);
    perf.modificarDatos(u);
    }

    public int getTelefonoFijo() {
         
        return this.u.getTfijo();

    }
    
    public String getEspecialidad(){
         if(((Tecnico) u).getEspecialidad()==null)return "--";
        return ((Tecnico) u).getEspecialidad();
    }
     public void setEspecialidad(String esp){
       ((Tecnico) u).setEspecialidad(esp);
    perf.modificarDatos(u);
     }
    
    public String getDespachoAdmin(){
        if(((Administrador) u).getDespacho()==null)return "--";
        return ((Administrador) u).getDespacho();
    }
    public void setDespachoAdmin(String desp){
        ((Administrador) u).setDespacho(desp);
    perf.modificarDatos(u);
    }
    
     public String getDespachoJS(){
         if(((JefeServicio) u).getDespacho()==null)return "--";
        return ((JefeServicio) u).getDespacho();
    }
    public void setDespachoJS(String desp){
        ((JefeServicio) u).setDespacho(desp);
    perf.modificarDatos(u);
    }
    
      public String getDespachoAdministrativo(){
          if(((Administrativo) u).getDespacho()==null)return "--";
          
        return ((Administrativo) u).getDespacho();
    }
    public void setDespachoAdministrativo(String desp){
        ((Administrativo) u).setDespacho(desp);
    perf.modificarDatos(u);
    }
    

}
