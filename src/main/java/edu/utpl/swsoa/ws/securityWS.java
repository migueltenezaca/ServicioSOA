/*
 * Copyright 2015 cesar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utpl.swsoa.ws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import edu.utpl.swsoa.modelo.Persona;
import edu.utpl.swsoa.service.PersonaService;

/**
 *
 * @author cesar
 */
@WebService(serviceName = "servicioSoa")
@Stateless
public class securityWS {

    /**
     * This is a sample web service operation
     */
    @EJB
    PersonaService personaService; 
    
    @WebMethod(operationName = "buscarPersonaPorIdentificacion")
    public Persona buscarPersonaPorIdentificacion(@WebParam(name = "identificacion") String identificacion) {
        return personaService.buscarPersonaPorIdentificacion(identificacion);
    }
    
    @WebMethod(operationName = "buscarPersonaPorId")
    public Persona buscarPersonaPorId(@WebParam(name = "id") Integer id) {
        return personaService.buscarPersonaPorId(id);
    }

}
