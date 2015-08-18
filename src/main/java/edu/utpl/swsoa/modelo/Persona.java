/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.swsoa.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Miguel Tenezaca
 */
@Entity(name = "Pft_persona")
public class Persona implements Serializable {

    @Id
    @Column(name = "ent_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "ent_Identificacion")
    String identificacion;
    @Column(name = "per_genero_Id")
    String generoId;
    @Column(name = "per_nombre")
    String nombre;
    @Column(name = "PER_PRIMER_NOMBRE")
    String primerNombre;
    @Column(name = "PER_SEGUNDO_NOMBRE")
    String segundoNombre;
    @Column(name = "PER_PRIMER_APELLIDO")
    String primerApellido;
    @Column(name = "PER_SEGUNDO_APELLIDO")
    String perSegundoApellido;
    @Column(name = "PER_FECHA_NACIMIENTO")
    @Temporal(javax.persistence.TemporalType.DATE)
    Date fechaNacimiento;

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGeneroId() {
        return generoId;
    }

    public void setGeneroId(String generoId) {
        this.generoId = generoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getPerSegundoApellido() {
        return perSegundoApellido;
    }

    public void setPerSegundoApellido(String perSegundoApellido) {
        this.perSegundoApellido = perSegundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona {id=" + getId()
                + " identiciacion= " + getIdentificacion()
                + " primer nombre= " + getPrimerApellido()
                + " primer apellido= " + getPrimerApellido()
                + " fecha nacimiento= " + getFechaNacimiento()
                + " }";
    }

}
