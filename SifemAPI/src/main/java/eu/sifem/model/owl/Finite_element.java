package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Finite_element <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Finite_element extends Subdomain {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasElementSettings
     */
     
    /**
     * Gets all property values for the hasElementSettings property.<p>
     * 
     * @returns a collection of values for the hasElementSettings property.
     */
    Collection<? extends ElementSettings> getHasElementSettings();

    /**
     * Checks if the class has a hasElementSettings property value.<p>
     * 
     * @return true if there is a hasElementSettings property value.
     */
    boolean hasHasElementSettings();

    /**
     * Adds a hasElementSettings property value.<p>
     * 
     * @param newHasElementSettings the hasElementSettings property value to be added
     */
    void addHasElementSettings(ElementSettings newHasElementSettings);

    /**
     * Removes a hasElementSettings property value.<p>
     * 
     * @param oldHasElementSettings the hasElementSettings property value to be removed.
     */
    void removeHasElementSettings(ElementSettings oldHasElementSettings);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasNode
     */
     
    /**
     * Gets all property values for the hasNode property.<p>
     * 
     * @returns a collection of values for the hasNode property.
     */
    Collection<? extends Node> getHasNode();

    /**
     * Checks if the class has a hasNode property value.<p>
     * 
     * @return true if there is a hasNode property value.
     */
    boolean hasHasNode();

    /**
     * Adds a hasNode property value.<p>
     * 
     * @param newHasNode the hasNode property value to be added
     */
    void addHasNode(Node newHasNode);

    /**
     * Removes a hasNode property value.<p>
     * 
     * @param oldHasNode the hasNode property value to be removed.
     */
    void removeHasNode(Node oldHasNode);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasElementNumber
     */
     
    /**
     * Gets all property values for the hasElementNumber property.<p>
     * 
     * @returns a collection of values for the hasElementNumber property.
     */
    Collection<? extends Integer> getHasElementNumber();

    /**
     * Checks if the class has a hasElementNumber property value.<p>
     * 
     * @return true if there is a hasElementNumber property value.
     */
    boolean hasHasElementNumber();

    /**
     * Adds a hasElementNumber property value.<p>
     * 
     * @param newHasElementNumber the hasElementNumber property value to be added
     */
    void addHasElementNumber(Integer newHasElementNumber);

    /**
     * Removes a hasElementNumber property value.<p>
     * 
     * @param oldHasElementNumber the hasElementNumber property value to be removed.
     */
    void removeHasElementNumber(Integer oldHasElementNumber);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}