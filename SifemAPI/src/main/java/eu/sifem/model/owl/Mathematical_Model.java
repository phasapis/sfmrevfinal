package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Mathematical_Model <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Mathematical_Model extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasDomain
     */
     
    /**
     * Gets all property values for the hasDomain property.<p>
     * 
     * @returns a collection of values for the hasDomain property.
     */
    Collection<? extends Finite_Element_Model_Domain> getHasDomain();

    /**
     * Checks if the class has a hasDomain property value.<p>
     * 
     * @return true if there is a hasDomain property value.
     */
    boolean hasHasDomain();

    /**
     * Adds a hasDomain property value.<p>
     * 
     * @param newHasDomain the hasDomain property value to be added
     */
    void addHasDomain(Finite_Element_Model_Domain newHasDomain);

    /**
     * Removes a hasDomain property value.<p>
     * 
     * @param oldHasDomain the hasDomain property value to be removed.
     */
    void removeHasDomain(Finite_Element_Model_Domain oldHasDomain);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#idealizes
     */
     
    /**
     * Gets all property values for the idealizes property.<p>
     * 
     * @returns a collection of values for the idealizes property.
     */
    Collection<? extends Physical_System> getIdealizes();

    /**
     * Checks if the class has a idealizes property value.<p>
     * 
     * @return true if there is a idealizes property value.
     */
    boolean hasIdealizes();

    /**
     * Adds a idealizes property value.<p>
     * 
     * @param newIdealizes the idealizes property value to be added
     */
    void addIdealizes(Physical_System newIdealizes);

    /**
     * Removes a idealizes property value.<p>
     * 
     * @param oldIdealizes the idealizes property value to be removed.
     */
    void removeIdealizes(Physical_System oldIdealizes);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
