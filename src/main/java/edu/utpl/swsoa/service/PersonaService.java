/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utpl.swsoa.service;

import java.math.BigInteger;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;
import edu.utpl.swsoa.modelo.Persona;

/**
 *
 * @author cesar
 */
@Stateless
public class PersonaService {

    @EJB
    PersistenceService ps;

    public List<Persona> findPersonas() {

        Query q = ps.getEntityManger().createNamedQuery("pft_persona.findAll");
        return q.getResultList();
    }

    public Integer countPersonas() {
        Query q = ps.getEntityManger().createNativeQuery("{call get_all_persona ()}", Persona.class);
        List<Persona> list = q.getResultList();
        if (list != null) {
            list.stream().forEach((p) -> {
                System.out.println(p);
            });
            return list.size();
        }
        return 0;
    }

    public Persona buscarPersonaPorId(Integer id) {
        System.out.println("Buscar personas por id: " + id);
        return ps.getEntityProcedure("{call pft_db.get_persona_byId(?)}", Persona.class, id);
    }

    public Persona buscarPersonaPorIdentificacion(String identificacion) {
        System.out.println("Buscar personas por identificacion: " + identificacion);
        Persona p = ps.getEntityProcedure("{call pft_db.get_persona_byIdentificacion(?)}", Persona.class, identificacion);
        return p;
    }

    public List<Persona> buscarPersonaPorCriteri(String criterio) {
        System.out.println("Buscar personas por criterio: " + criterio);
        Query q = ps.getEntityManger().createNativeQuery("{call pft_db.get_personas_byCriterio(?)}", Persona.class);
        q.setParameter(1, criterio);
        List<Persona> list = q.getResultList();
        return list;
    }

}
