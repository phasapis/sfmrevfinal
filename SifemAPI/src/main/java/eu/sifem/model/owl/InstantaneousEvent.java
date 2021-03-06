package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: InstantaneousEvent <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface InstantaneousEvent extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.w3.org/ns/prov#atTime
     */
     
    /**
     * Gets all property values for the atTime property.<p>
     * 
     * @returns a collection of values for the atTime property.
     */
    Collection<? extends Object> getAtTime();

    /**
     * Checks if the class has a atTime property value.<p>
     * 
     * @return true if there is a atTime property value.
     */
    boolean hasAtTime();

    /**
     * Adds a atTime property value.<p>
     * 
     * @param newAtTime the atTime property value to be added
     */
    void addAtTime(Object newAtTime);

    /**
     * Removes a atTime property value.<p>
     * 
     * @param oldAtTime the atTime property value to be removed.
     */
    void removeAtTime(Object oldAtTime);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
