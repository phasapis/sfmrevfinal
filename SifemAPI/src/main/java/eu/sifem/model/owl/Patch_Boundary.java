package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Patch_Boundary <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Patch_Boundary extends Boundary {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasBoundarySettings
     */
     
    /**
     * Gets all property values for the hasBoundarySettings property.<p>
     * 
     * @returns a collection of values for the hasBoundarySettings property.
     */
    Collection<? extends WrappedIndividual> getHasBoundarySettings();

    /**
     * Checks if the class has a hasBoundarySettings property value.<p>
     * 
     * @return true if there is a hasBoundarySettings property value.
     */
    boolean hasHasBoundarySettings();

    /**
     * Adds a hasBoundarySettings property value.<p>
     * 
     * @param newHasBoundarySettings the hasBoundarySettings property value to be added
     */
    void addHasBoundarySettings(WrappedIndividual newHasBoundarySettings);

    /**
     * Removes a hasBoundarySettings property value.<p>
     * 
     * @param oldHasBoundarySettings the hasBoundarySettings property value to be removed.
     */
    void removeHasBoundarySettings(WrappedIndividual oldHasBoundarySettings);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasBoundaryNode
     */
     
    /**
     * Gets all property values for the hasBoundaryNode property.<p>
     * 
     * @returns a collection of values for the hasBoundaryNode property.
     */
    Collection<? extends Node> getHasBoundaryNode();

    /**
     * Checks if the class has a hasBoundaryNode property value.<p>
     * 
     * @return true if there is a hasBoundaryNode property value.
     */
    boolean hasHasBoundaryNode();

    /**
     * Adds a hasBoundaryNode property value.<p>
     * 
     * @param newHasBoundaryNode the hasBoundaryNode property value to be added
     */
    void addHasBoundaryNode(Node newHasBoundaryNode);

    /**
     * Removes a hasBoundaryNode property value.<p>
     * 
     * @param oldHasBoundaryNode the hasBoundaryNode property value to be removed.
     */
    void removeHasBoundaryNode(Node oldHasBoundaryNode);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isBoundaryOf
     */
     
    /**
     * Gets all property values for the isBoundaryOf property.<p>
     * 
     * @returns a collection of values for the isBoundaryOf property.
     */
    Collection<? extends WrappedIndividual> getIsBoundaryOf();

    /**
     * Checks if the class has a isBoundaryOf property value.<p>
     * 
     * @return true if there is a isBoundaryOf property value.
     */
    boolean hasIsBoundaryOf();

    /**
     * Adds a isBoundaryOf property value.<p>
     * 
     * @param newIsBoundaryOf the isBoundaryOf property value to be added
     */
    void addIsBoundaryOf(WrappedIndividual newIsBoundaryOf);

    /**
     * Removes a isBoundaryOf property value.<p>
     * 
     * @param oldIsBoundaryOf the isBoundaryOf property value to be removed.
     */
    void removeIsBoundaryOf(WrappedIndividual oldIsBoundaryOf);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
