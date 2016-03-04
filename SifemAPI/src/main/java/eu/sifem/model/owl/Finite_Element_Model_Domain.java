package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Finite_Element_Model_Domain <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Finite_Element_Model_Domain extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasDomainSettings
     */
     
    /**
     * Gets all property values for the hasDomainSettings property.<p>
     * 
     * @returns a collection of values for the hasDomainSettings property.
     */
    Collection<? extends DomainSettings> getHasDomainSettings();

    /**
     * Checks if the class has a hasDomainSettings property value.<p>
     * 
     * @return true if there is a hasDomainSettings property value.
     */
    boolean hasHasDomainSettings();

    /**
     * Adds a hasDomainSettings property value.<p>
     * 
     * @param newHasDomainSettings the hasDomainSettings property value to be added
     */
    void addHasDomainSettings(DomainSettings newHasDomainSettings);

    /**
     * Removes a hasDomainSettings property value.<p>
     * 
     * @param oldHasDomainSettings the hasDomainSettings property value to be removed.
     */
    void removeHasDomainSettings(DomainSettings oldHasDomainSettings);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasLoad
     */
     
    /**
     * Gets all property values for the hasLoad property.<p>
     * 
     * @returns a collection of values for the hasLoad property.
     */
    Collection<? extends Loading_> getHasLoad();

    /**
     * Checks if the class has a hasLoad property value.<p>
     * 
     * @return true if there is a hasLoad property value.
     */
    boolean hasHasLoad();

    /**
     * Adds a hasLoad property value.<p>
     * 
     * @param newHasLoad the hasLoad property value to be added
     */
    void addHasLoad(Loading_ newHasLoad);

    /**
     * Removes a hasLoad property value.<p>
     * 
     * @param oldHasLoad the hasLoad property value to be removed.
     */
    void removeHasLoad(Loading_ oldHasLoad);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isDiscretizedBy
     */
     
    /**
     * Gets all property values for the isDiscretizedBy property.<p>
     * 
     * @returns a collection of values for the isDiscretizedBy property.
     */
    Collection<? extends Mesh> getIsDiscretizedBy();

    /**
     * Checks if the class has a isDiscretizedBy property value.<p>
     * 
     * @return true if there is a isDiscretizedBy property value.
     */
    boolean hasIsDiscretizedBy();

    /**
     * Adds a isDiscretizedBy property value.<p>
     * 
     * @param newIsDiscretizedBy the isDiscretizedBy property value to be added
     */
    void addIsDiscretizedBy(Mesh newIsDiscretizedBy);

    /**
     * Removes a isDiscretizedBy property value.<p>
     * 
     * @param oldIsDiscretizedBy the isDiscretizedBy property value to be removed.
     */
    void removeIsDiscretizedBy(Mesh oldIsDiscretizedBy);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isDomainOf
     */
     
    /**
     * Gets all property values for the isDomainOf property.<p>
     * 
     * @returns a collection of values for the isDomainOf property.
     */
    Collection<? extends Mathematical_Model> getIsDomainOf();

    /**
     * Checks if the class has a isDomainOf property value.<p>
     * 
     * @return true if there is a isDomainOf property value.
     */
    boolean hasIsDomainOf();

    /**
     * Adds a isDomainOf property value.<p>
     * 
     * @param newIsDomainOf the isDomainOf property value to be added
     */
    void addIsDomainOf(Mathematical_Model newIsDomainOf);

    /**
     * Removes a isDomainOf property value.<p>
     * 
     * @param oldIsDomainOf the isDomainOf property value to be removed.
     */
    void removeIsDomainOf(Mathematical_Model oldIsDomainOf);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}