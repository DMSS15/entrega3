package Controladores;

import EJB.ActualizarUsuarioLocal;
import EJB.AdministradorLocal;
import JPA.Administrador;
import JPA.Administrativo;
import JPA.Ciudadano;
import JPA.JefeServicio;
import JPA.Tecnico;
import JPA.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author María
 */
@ManagedBean
@SessionScoped
public class actualizarUsuario implements Serializable {

    @EJB
    private ActualizarUsuarioLocal au;

    private Usuario u = new Usuario();

    private String dni2;
    private boolean tecnico,administrativo,jefeservicio;
    public actualizarUsuario() {

    }

    public String getDni2() {
        return dni2;
    }

    public void setDni2(String dni2) {
        this.dni2 = dni2;
    }

    public Usuario getUsuario() {
        return u;
    }

    public void setUsuario(Usuario u) {
        this.u = u;
    }

    public String getNombre() {

        return u.getNombre();
    }

    public void setNombre(String nombre) {
        u.setNombre(nombre);
        au.actualizarUsuario(u);
    }

    public String getApellidos() {
        
        return u.getApellidos();
    }
    
    public void setApellidos(String apellidos){
        u.setApellidos(apellidos);
        au.actualizarUsuario(u);
    }
    
    public String getDni() {
        return u.getDni();
    }

    public void setDni(String dni) {
        this.u.setDni(dni);
        au.actualizarUsuario(u);
    }

    public String getPassword() {
        return u.getPassword();
    }

    public void setPassword(String password) {
        this.u.setPassword(password);
        au.actualizarUsuario(u);
    }

    public String getCentro() {
        return u.getCentro();
    }

    public void setCentro(String centro) {
        this.u.setCentro(centro);
        au.actualizarUsuario(u);
    }

    public String getSexo() {
        return u.getSexo();
    }

    public void setSexo(String sexo) {
        this.u.setSexo(sexo);
        au.actualizarUsuario(u);
    }

    public String getNacionalidad() {
        if(u.getNacionalidad()==null) return "--";
        return u.getNacionalidad();
    }

    public void setNacionalidad(String nacionalidad) {
        this.u.setNacionalidad(nacionalidad);
        au.actualizarUsuario(u);

    }

    public String getDireccion() {
        return u.getDireccion();
    }

    public void setDireccion(String direccion) {
        this.u.setDireccion(direccion);
        au.actualizarUsuario(u);
    }

    public Date getNacimiento() {
        return u.getNacimiento();
    }

    public void setNacimiento(Date nacimiento) {
        this.u.setNacimiento(nacimiento);
        au.actualizarUsuario(u);
    }

    public String getCorreo() {
        return u.getCorreo();
    }

    public void setCorreo(String correo) {
        this.u.setCorreo(correo);
        au.actualizarUsuario(u);
        
    }

    public String getTelefono() {

        return u.getTelefono();
    }

    public void setTelefono(String telefono) {
        this.u.setTelefono(telefono);
        au.actualizarUsuario(u);
    }

    public void setTelefonoFijo(int telef) {
        this.u.setTfijo(telef);
        au.actualizarUsuario(u);
    }

    public int getTelefonoFijo() {
        return this.u.getTfijo();

    }

    public String getEspecialidad() {
        return ((Tecnico) u).getEspecialidad();
    }

    public void setEspecialidad(String esp) {
        ((Tecnico) u).setEspecialidad(esp);
        au.actualizarUsuario(u);
    }

    public String getDespachoAdmin() {
        return ((Administrador) u).getDespacho();
    }

    public void setDespachoAdmin(String desp) {
        ((Administrador) u).setDespacho(desp);
        au.actualizarUsuario(u);
    }

    public String getDespachoJS() {
        return ((JefeServicio) u).getDespacho();
    }

    public void setDespachoJS(String desp) {
        ((JefeServicio) u).setDespacho(desp);
        au.actualizarUsuario(u);
    }

    public String getDespachoAdministrativo() {
        return ((Administrativo) u).getDespacho();
    }

    public void setDespachoAdministrativo(String desp) {
        ((Administrativo) u).setDespacho(desp);
        au.actualizarUsuario(u);
    }

    public ActualizarUsuarioLocal getAu() {
        return au;
    }

    public void setAu(ActualizarUsuarioLocal au) {
        this.au = au;
        au.actualizarUsuario(u);
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
     
    }

    public boolean isTecnico() {
        return tecnico= u instanceof Tecnico;
    }

    public void setTecnico(boolean tecnico) {
        this.tecnico = tecnico;
    }

    public boolean isAdministrativo() {
        return administrativo= u instanceof Administrativo;
    }

    public void setAdministrativo(boolean administrativo) {
        this.administrativo = administrativo;
    }

    public boolean isJefeservicio() {
        return jefeservicio;
    }

    public void setJefeservicio(boolean jefeservicio) {
        this.jefeservicio = u instanceof JefeServicio;;
    }

    public void busqueda() {
        
        jefeservicio=false; administrativo=false; tecnico=false; 
        
        u = au.getUsuario(dni2);
        
        
    }
    
    public void actualizar(){
        au.actualizarUsuario(u);
    }
}
