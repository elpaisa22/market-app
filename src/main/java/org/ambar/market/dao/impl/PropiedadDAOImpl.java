/**
 * market-appl [19/11/2014 20:45:58]
 */
package org.ambar.market.dao.impl;

import org.ambar.core.dao.impl.CrudDAOImpl;
import org.ambar.market.be.Propiedad;
import org.ambar.market.dao.PropiedadDAO;
import org.springframework.stereotype.Component;

/**
 * <p>
 * Implementación de DAO de la entidad {@link Cliente}.
 * </p>
 *
 * @author Sebastian
 *
 */
@Component(value = "propiedadDAO")
public class PropiedadDAOImpl extends CrudDAOImpl<Long, Propiedad> implements PropiedadDAO {
}
