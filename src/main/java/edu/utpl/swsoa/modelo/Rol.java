/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.swsoa.modelo;

/**
 *
 * @author Miguel Tenezaca
 */
public class Rol {
    Integer id_rol;
    String rol_tipo;

    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol_tipo() {
        return rol_tipo;
    }

    public void setRol_tipo(String rol_tipo) {
        this.rol_tipo = rol_tipo;
    }

    public Rol(Integer id_rol, String rol_tipo) {
        this.id_rol = id_rol;
        this.rol_tipo = rol_tipo;
    }

    public Rol() {
    }
    
    
    
}
