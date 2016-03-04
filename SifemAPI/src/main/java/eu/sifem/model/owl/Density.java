package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Density <br>
 * @version generated on Mon May 11 16:25:18 BST 2015 by jbjares
 */

public interface Density extends Structural {

    /* ***************************************************
     * Property http://codata.jp/OML-Property.owl#UnitDimension
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
     * Property http://codata.jp/OML-Property.owl#UnitSystem
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
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMaterialPropertyOf
     */
     
    /**
     * Gets all property values for the isMaterialPropertyOf property.<p>
     * 
     * @returns a collection of values for the isMaterialPropertyOf property.
     */
    Collection<? extends WrappedIndividual> getIsMaterialPropertyOf();

    /**
     * Checks if the class has a isMaterialPropertyOf property value.<p>
     * 
     * @return true if there is a isMaterialPropertyOf property value.
     */
    boolean hasIsMaterialPropertyOf();

    /**
     * Adds a isMaterialPropertyOf property value.<p>
     * 
     * @param newIsMaterialPropertyOf the isMaterialPropertyOf property value to be added
     */
    void addIsMaterialPropertyOf(WrappedIndividual newIsMaterialPropertyOf);

    /**
     * Removes a isMaterialPropertyOf property value.<p>
     * 
     * @param oldIsMaterialPropertyOf the isMaterialPropertyOf property value to be removed.
     */
    void removeIsMaterialPropertyOf(WrappedIndividual oldIsMaterialPropertyOf);


    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMaterialPropertyUsedBy
     */
     
    /**
     * Gets all property values for the isMaterialPropertyUsedBy property.<p>
     * 
     * @returns a collection of values for the isMaterialPropertyUsedBy property.
     */
    Collection<? extends Solver> getIsMaterialPropertyUsedBy();

    /**
     * Checks if the class has a isMaterialPropertyUsedBy property value.<p>
     * 
     * @return true if there is a isMaterialPropertyUsedBy property value.
     */
    boolean hasIsMaterialPropertyUsedBy();

    /**
     * Adds a isMaterialPropertyUsedBy property value.<p>
     * 
     * @param newIsMaterialPropertyUsedBy the isMaterialPropertyUsedBy property value to be added
     */
    void addIsMaterialPropertyUsedBy(Solver newIsMaterialPropertyUsedBy);

    /**
     * Removes a isMaterialPropertyUsedBy property value.<p>
     * 
     * @param oldIsMaterialPropertyUsedBy the isMaterialPropertyUsedBy property value to be removed.
     */
    void removeIsMaterialPropertyUsedBy(Solver oldIsMaterialPropertyUsedBy);


    /* ***************************************************
     * Property http://codata.jp/OML-Property.owl#MaximalValue
     */
     
    /**
     * Gets all property values for the MaximalValue property.<p>
     * 
     * @returns a collection of values for the MaximalValue property.
     */
    Collection<? extends Object> getMaximalValue();

    /**
     * Checks if the class has a MaximalValue property value.<p>
     * 
     * @return true if there is a MaximalValue property value.
     */
    boolean hasMaximalValue();

    /**
     * Adds a MaximalValue property value.<p>
     * 
     * @param newMaximalValue the MaximalValue property value to be added
     */
    void addMaximalValue(Object newMaximalValue);

    /**
     * Removes a MaximalValue property value.<p>
     * 
     * @param oldMaximalValue the MaximalValue property value to be removed.
     */
    void removeMaximalValue(Object oldMaximalValue);



    /* ***************************************************
     * Property http://codata.jp/OML-Property.owl#MinimumValue
     */
     
    /**
     * Gets all property values for the MinimumValue property.<p>
     * 
     * @returns a collection of values for the MinimumValue property.
     */
    Collection<? extends Object> getMinimumValue();

    /**
     * Checks if the class has a MinimumValue property value.<p>
     * 
     * @return true if there is a MinimumValue property value.
     */
    boolean hasMinimumValue();

    /**
     * Adds a MinimumValue property value.<p>
     * 
     * @param newMinimumValue the MinimumValue property value to be added
     */
    void addMinimumValue(Object newMinimumValue);

    /**
     * Removes a MinimumValue property value.<p>
     * 
     * @param oldMinimumValue the MinimumValue property value to be removed.
     */
    void removeMinimumValue(Object oldMinimumValue);



    /* ***************************************************
     * Property http://codata.jp/OML-Property.owl#Value
     */
     
    /**
     * Gets all property values for the Value property.<p>
     * 
     * @returns a collection of values for the Value property.
     */
    Collection<? extends Object> getValue();

    /**
     * Checks if the class has a Value property value.<p>
     * 
     * @return true if there is a Value property value.
     */
    boolean hasValue();

    /**
     * Adds a Value property value.<p>
     * 
     * @param newValue the Value property value to be added
     */
    void addValue(Object newValue);

    /**
     * Removes a Value property value.<p>
     * 
     * @param oldValue the Value property value to be removed.
     */
    void removeValue(Object oldValue);



    /* ***************************************************
     * Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasMaterialPropertyValue
     */
     
    /**
     * Gets all property values for the hasMaterialPropertyValue property.<p>
     * 
     * @returns a collection of values for the hasMaterialPropertyValue property.
     */
    Collection<? extends Object> getHasMaterialPropertyValue();

    /**
     * Checks if the class has a hasMaterialPropertyValue property value.<p>
     * 
     * @return true if there is a hasMaterialPropertyValue property value.
     */
    boolean hasHasMaterialPropertyValue();

    /**
     * Adds a hasMaterialPropertyValue property value.<p>
     * 
     * @param newHasMaterialPropertyValue the hasMaterialPropertyValue property value to be added
     */
    void addHasMaterialPropertyValue(Object newHasMaterialPropertyValue);

    /**
     * Removes a hasMaterialPropertyValue property value.<p>
     * 
     * @param oldHasMaterialPropertyValue the hasMaterialPropertyValue property value to be removed.
     */
    void removeHasMaterialPropertyValue(Object oldHasMaterialPropertyValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
