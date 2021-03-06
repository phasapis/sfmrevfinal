package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Finite_Element_Model <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Finite_Element_Model extends Discrete_Model {

    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasFiniteElementModelSettings
     */
     
    /**
     * Gets all property values for the hasFiniteElementModelSettings property.<p>
     * 
     * @returns a collection of values for the hasFiniteElementModelSettings property.
     */
    Collection<? extends FiniteElementModelSettings> getHasFiniteElementModelSettings();

    /**
     * Checks if the class has a hasFiniteElementModelSettings property value.<p>
     * 
     * @return true if there is a hasFiniteElementModelSettings property value.
     */
    boolean hasHasFiniteElementModelSettings();

    /**
     * Adds a hasFiniteElementModelSettings property value.<p>
     * 
     * @param newHasFiniteElementModelSettings the hasFiniteElementModelSettings property value to be added
     */
    void addHasFiniteElementModelSettings(FiniteElementModelSettings newHasFiniteElementModelSettings);

    /**
     * Removes a hasFiniteElementModelSettings property value.<p>
     * 
     * @param oldHasFiniteElementModelSettings the hasFiniteElementModelSettings property value to be removed.
     */
    void removeHasFiniteElementModelSettings(FiniteElementModelSettings oldHasFiniteElementModelSettings);


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
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasMesh
     */
     
    /**
     * Gets all property values for the hasMesh property.<p>
     * 
     * @returns a collection of values for the hasMesh property.
     */
    Collection<? extends Mesh> getHasMesh();

    /**
     * Checks if the class has a hasMesh property value.<p>
     * 
     * @return true if there is a hasMesh property value.
     */
    boolean hasHasMesh();

    /**
     * Adds a hasMesh property value.<p>
     * 
     * @param newHasMesh the hasMesh property value to be added
     */
    void addHasMesh(Mesh newHasMesh);

    /**
     * Removes a hasMesh property value.<p>
     * 
     * @param oldHasMesh the hasMesh property value to be removed.
     */
    void removeHasMesh(Mesh oldHasMesh);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasPerformedOnIt
     */
     
    /**
     * Gets all property values for the hasPerformedOnIt property.<p>
     * 
     * @returns a collection of values for the hasPerformedOnIt property.
     */
    Collection<? extends WrappedIndividual> getHasPerformedOnIt();

    /**
     * Checks if the class has a hasPerformedOnIt property value.<p>
     * 
     * @return true if there is a hasPerformedOnIt property value.
     */
    boolean hasHasPerformedOnIt();

    /**
     * Adds a hasPerformedOnIt property value.<p>
     * 
     * @param newHasPerformedOnIt the hasPerformedOnIt property value to be added
     */
    void addHasPerformedOnIt(WrappedIndividual newHasPerformedOnIt);

    /**
     * Removes a hasPerformedOnIt property value.<p>
     * 
     * @param oldHasPerformedOnIt the hasPerformedOnIt property value to be removed.
     */
    void removeHasPerformedOnIt(WrappedIndividual oldHasPerformedOnIt);


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
