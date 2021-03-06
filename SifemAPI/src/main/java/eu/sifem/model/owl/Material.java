package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Material <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Material extends WrappedIndividual {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasMaterialSettings
     */
     
    /**
     * Gets all property values for the hasMaterialSettings property.<p>
     * 
     * @returns a collection of values for the hasMaterialSettings property.
     */
    Collection<? extends MaterialSettings> getHasMaterialSettings();

    /**
     * Checks if the class has a hasMaterialSettings property value.<p>
     * 
     * @return true if there is a hasMaterialSettings property value.
     */
    boolean hasHasMaterialSettings();

    /**
     * Adds a hasMaterialSettings property value.<p>
     * 
     * @param newHasMaterialSettings the hasMaterialSettings property value to be added
     */
    void addHasMaterialSettings(MaterialSettings newHasMaterialSettings);

    /**
     * Removes a hasMaterialSettings property value.<p>
     * 
     * @param oldHasMaterialSettings the hasMaterialSettings property value to be removed.
     */
    void removeHasMaterialSettings(MaterialSettings oldHasMaterialSettings);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMaterialOf
     */
     
    /**
     * Gets all property values for the isMaterialOf property.<p>
     * 
     * @returns a collection of values for the isMaterialOf property.
     */
    Collection<? extends Subdomain_group> getIsMaterialOf();

    /**
     * Checks if the class has a isMaterialOf property value.<p>
     * 
     * @return true if there is a isMaterialOf property value.
     */
    boolean hasIsMaterialOf();

    /**
     * Adds a isMaterialOf property value.<p>
     * 
     * @param newIsMaterialOf the isMaterialOf property value to be added
     */
    void addIsMaterialOf(Subdomain_group newIsMaterialOf);

    /**
     * Removes a isMaterialOf property value.<p>
     * 
     * @param oldIsMaterialOf the isMaterialOf property value to be removed.
     */
    void removeIsMaterialOf(Subdomain_group oldIsMaterialOf);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
