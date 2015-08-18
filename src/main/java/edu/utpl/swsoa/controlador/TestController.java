/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.swsoa.controlador;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import edu.utpl.swsoa.modelo.Persona;
import edu.utpl.swsoa.service.PersonaService;

/**
 *
 * @author cesar
 */
@Named
@ViewScoped
public class TestController implements Serializable {

    @EJB
    PersonaService personaService;

    static final Logger logger = Logger.getLogger(TestController.class.getName());

    public List<Persona> obtenerPersonas() {
        logger.log(Level.INFO, "Ingreso a buscar personas");
        return personaService.findPersonas();
    }

    public void buscarPersonas() {
        logger.log(Level.INFO, "Ingreso a buscar personas por criterio 11041");
        logger.log(Level.INFO, "TOTAL PERSONAS: {0}", personaService.buscarPersonaPorCriteri("11041"));

    }
}
