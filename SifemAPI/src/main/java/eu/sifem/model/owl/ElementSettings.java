package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: ElementSettings <br>
 * @version generated on Mon May 11 16:25:19 BST 2015 by jbjares
 */

public interface ElementSettings extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#areElementSettingsOf
     */
     
    /**
     * Gets all property values for the areElementSettingsOf property.<p>
     * 
     * @returns a collection of values for the areElementSettingsOf property.
     */
    Collection<? extends Finite_element> getAreElementSettingsOf();

    /**
     * Checks if the class has a areElementSettingsOf property value.<p>
     * 
     * @return true if there is a areElementSettingsOf property value.
     */
    boolean hasAreElementSettingsOf();

    /**
     * Adds a areElementSettingsOf property value.<p>
     * 
     * @param newAreElementSettingsOf the areElementSettingsOf property value to be added
     */
    void addAreElementSettingsOf(Finite_element newAreElementSettingsOf);

    /**
     * Removes a areElementSettingsOf property value.<p>
     * 
     * @param oldAreElementSettingsOf the areElementSettingsOf property value to be removed.
     */
    void removeAreElementSettingsOf(Finite_element oldAreElementSettingsOf);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasUnusedElementBlockValue1
     */
     
    /**
     * Gets all property values for the hasUnusedElementBlockValue1 property.<p>
     * 
     * @returns a collection of values for the hasUnusedElementBlockValue1 property.
     */
    Collection<? extends Integer> getHasUnusedElementBlockValue1();

    /**
     * Checks if the class has a hasUnusedElementBlockValue1 property value.<p>
     * 
     * @return true if there is a hasUnusedElementBlockValue1 property value.
     */
    boolean hasHasUnusedElementBlockValue1();

    /**
     * Adds a hasUnusedElementBlockValue1 property value.<p>
     * 
     * @param newHasUnusedElementBlockValue1 the hasUnusedElementBlockValue1 property value to be added
     */
    void addHasUnusedElementBlockValue1(Integer newHasUnusedElementBlockValue1);

    /**
     * Removes a hasUnusedElementBlockValue1 property value.<p>
     * 
     * @param oldHasUnusedElementBlockValue1 the hasUnusedElementBlockValue1 property value to be removed.
     */
    void removeHasUnusedElementBlockValue1(Integer oldHasUnusedElementBlockValue1);



    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasUnusedElementBlockValue2
     */
     
    /**
     * Gets all property values for the hasUnusedElementBlockValue2 property.<p>
     * 
     * @returns a collection of values for the hasUnusedElementBlockValue2 property.
     */
    Collection<? extends Integer> getHasUnusedElementBlockValue2();

    /**
     * Checks if the class has a hasUnusedElementBlockValue2 property value.<p>
     * 
     * @return true if there is a hasUnusedElementBlockValue2 property value.
     */
    boolean hasHasUnusedElementBlockValue2();

    /**
     * Adds a hasUnusedElementBlockValue2 property value.<p>
     * 
     * @param newHasUnusedElementBlockValue2 the hasUnusedElementBlockValue2 property value to be added
     */
    void addHasUnusedElementBlockValue2(Integer newHasUnusedElementBlockValue2);

    /**
     * Removes a hasUnusedElementBlockValue2 property value.<p>
     * 
     * @param oldHasUnusedElementBlockValue2 the hasUnusedElementBlockValue2 property value to be removed.
     */
    void removeHasUnusedElementBlockValue2(Integer oldHasUnusedElementBlockValue2);



    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasUnusedElementBlockValue3
     */
     
    /**
     * Gets all property values for the hasUnusedElementBlockValue3 property.<p>
     * 
     * @returns a collection of values for the hasUnusedElementBlockValue3 property.
     */
    Collection<? extends Integer> getHasUnusedElementBlockValue3();

    /**
     * Checks if the class has a hasUnusedElementBlockValue3 property value.<p>
     * 
     * @return true if there is a hasUnusedElementBlockValue3 property value.
     */
    boolean hasHasUnusedElementBlockValue3();

    /**
     * Adds a hasUnusedElementBlockValue3 property value.<p>
     * 
     * @param newHasUnusedElementBlockValue3 the hasUnusedElementBlockValue3 property value to be added
     */
    void addHasUnusedElementBlockValue3(Integer newHasUnusedElementBlockValue3);

    /**
     * Removes a hasUnusedElementBlockValue3 property value.<p>
     * 
     * @param oldHasUnusedElementBlockValue3 the hasUnusedElementBlockValue3 property value to be removed.
     */
    void removeHasUnusedElementBlockValue3(Integer oldHasUnusedElementBlockValue3);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
