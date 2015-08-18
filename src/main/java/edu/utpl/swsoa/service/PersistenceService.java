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
package edu.utpl.swsoa.service;

import edu.utpl.swsoa.exception.NullParametersException;
import edu.utpl.swsoa.modelo.Persona;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cesar
 */
@Stateful
public class PersistenceService {

    @PersistenceContext(unitName = "servicioSoapu")
    protected EntityManager em;

    public EntityManager getEntityManger() {
        return this.em;
    }

    public List getListProcedure(String call, Class type, Object... parameters) {
        if (call != null && parameters != null && parameters.length > 0) {
            Query q = em.createNativeQuery(call, type);
            int c = 1;
            for (Object p : parameters) {
                q.setParameter(c, p);
                c++;
            }

            return q.getResultList();
        }

        return new LinkedList();
    }

    public <E> E getEntityProcedure(String call, Class<E> type, Object... parameters) {
        if (call != null && parameters != null && parameters.length > 0) {
            Query q = em.createNativeQuery(call, type);
            int c = 1;
            for (Object p : parameters) {
                q.setParameter(c, p);
                c++;
            }

            List t = q.getResultList();
            if (!t.isEmpty()) {
                return (E) t.get(0);
            }
        }

        return null;
    }

}
