package org.ambar.market.viewbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.ambar.core.commons.filters.QueryPredicate;
import org.ambar.market.be.Propiedad;
import org.ambar.market.dao.PropiedadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component(value = "dataGridView")
public class DataGridView implements Serializable {
     
    private static final long serialVersionUID = 6986473880957058130L;

	private List<Propiedad> propiedades;
     
    private Propiedad propiedadSeleccionada;
    
    @Autowired
    private PropiedadDAO dao;
    
    @PostConstruct
    public void init() {
    	QueryPredicate qry = new QueryPredicate();
    	propiedades = dao.getFilteredList(qry).getFilteredList();
    }

	/**
	 * @return Retorna el valor del atributo propiedadSeleccionada.
	 */
	public Propiedad getPropiedadSeleccionada() {
		return propiedadSeleccionada;
	}

	/**
	 * @param pPropiedadSeleccionada Establece el valor del atributo propiedadSeleccionada.
	 */
	public void setPropiedadSeleccionada(Propiedad pPropiedadSeleccionada) {
		propiedadSeleccionada = pPropiedadSeleccionada;
	}

	/**
	 * @return Retorna el valor del atributo dao.
	 */
	public PropiedadDAO getDao() {
		return dao;
	}

	/**
	 * @param pDao Establece el valor del atributo dao.
	 */
	public void setDao(PropiedadDAO pDao) {
		dao = pDao;
	}

	/**
	 * @return Retorna el valor del atributo propiedades.
	 */
	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	/**
	 * @param pPropiedades Establece el valor del atributo propiedades.
	 */
	public void setPropiedades(List<Propiedad> pPropiedades) {
		propiedades = pPropiedades;
	}
 
 

}