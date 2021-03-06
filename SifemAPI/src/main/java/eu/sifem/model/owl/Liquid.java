package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Liquid <br>
 * @version generated on Mon May 11 16:25:17 BST 2015 by jbjares
 */

public interface Liquid extends Atmosphere {

    /* ***************************************************
     * Property http://codata.jp/OML-Environment.owl#UnitDimension
     */
     
    /**
     * Gets all property values for the UnitDimension property.<p>
     * 
     * @returns a collection of values for the UnitDimension property.
     */
    Collection<? extends UnitDimension> getUnitDimension();

    /**
     * Checks if the class has a UnitDimension property value.<p>
     * 
     * @return true if there is a UnitDimension property value.
     */
    boolean hasUnitDimension();

    /**
     * Adds a UnitDimension property value.<p>
     * 
     * @param newUnitDimension the UnitDimension property value to be added
     */
    void addUnitDimension(UnitDimension newUnitDimension);

    /**
     * Removes a UnitDimension property value.<p>
     * 
     * @param oldUnitDimension the UnitDimension property value to be removed.
     */
    void removeUnitDimension(UnitDimension oldUnitDimension);


    /* ***************************************************
     * Property http://codata.jp/OML-Environment.owl#UnitSystem
     */
     
    /**
     * Gets all property values for the UnitSystem property.<p>
     * 
     * @returns a collection of values for the UnitSystem property.
     */
    Collection<? extends UnitSystem> getUnitSystem();

    /**
     * Checks if the class has a UnitSystem property value.<p>
     * 
     * @return true if there is a UnitSystem property value.
     */
    boolean hasUnitSystem();

    /**
     * Adds a UnitSystem property value.<p>
     * 
     * @param newUnitSystem the UnitSystem property value to be added
     */
    void addUnitSystem(UnitSystem newUnitSystem);

    /**
     * Removes a UnitSystem property value.<p>
     * 
     * @param oldUnitSystem the UnitSystem property value to be removed.
     */
    void removeUnitSystem(UnitSystem oldUnitSystem);


    /* ***************************************************
     * Property http://codata.jp/OML-Environment.owl#typeOfLiquid
     */
     
    /**
     * Gets all property values for the typeOfLiquid property.<p>
     * 
     * @returns a collection of values for the typeOfLiquid property.
     */
    Collection<? extends Object> getTypeOfLiquid();

    /**
     * Checks if the class has a typeOfLiquid property value.<p>
     * 
     * @return true if there is a typeOfLiquid property value.
     */
    boolean hasTypeOfLiquid();

    /**
     * Adds a typeOfLiquid property value.<p>
     * 
     * @param newTypeOfLiquid the typeOfLiquid property value to be added
     */
    void addTypeOfLiquid(Object newTypeOfLiquid);

    /**
     * Removes a typeOfLiquid property value.<p>
     * 
     * @param oldTypeOfLiquid the typeOfLiquid property value to be removed.
     */
    void removeTypeOfLiquid(Object oldTypeOfLiquid);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
