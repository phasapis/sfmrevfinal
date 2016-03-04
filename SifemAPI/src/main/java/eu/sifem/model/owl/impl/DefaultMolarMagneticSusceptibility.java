package eu.sifem.model.owl.impl;

import eu.sifem.model.owl.*;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultMolarMagneticSusceptibility <br>
 * @version generated on Mon May 11 16:25:18 BST 2015 by jbjares
 */
public class DefaultMolarMagneticSusceptibility extends WrappedIndividualImpl implements MolarMagneticSusceptibility {

    public DefaultMolarMagneticSusceptibility(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://codata.jp/OML-Property.owl#UnitDimension
     */
     
    public Collection<? extends UnitDimension> getUnitDimension() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_UNITDIMENSION,
                                               DefaultUnitDimension.class);
    }

    public boolean hasUnitDimension() {
	   return !getUnitDimension().isEmpty();
    }

    public void addUnitDimension(UnitDimension newUnitDimension) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_UNITDIMENSION,
                                       newUnitDimension);
    }

    public void removeUnitDimension(UnitDimension oldUnitDimension) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_UNITDIMENSION,
                                          oldUnitDimension);
    }


    /* ***************************************************
     * Object Property http://codata.jp/OML-Property.owl#UnitSystem
     */
     
    public Collection<? extends UnitSystem> getUnitSystem() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_UNITSYSTEM,
                                               DefaultUnitSystem.class);
    }

    public boolean hasUnitSystem() {
	   return !getUnitSystem().isEmpty();
    }

    public void addUnitSystem(UnitSystem newUnitSystem) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_UNITSYSTEM,
                                       newUnitSystem);
    }

    public void removeUnitSystem(UnitSystem oldUnitSystem) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_UNITSYSTEM,
                                          oldUnitSystem);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMaterialPropertyOf
     */
     
    public Collection<? extends WrappedIndividual> getIsMaterialPropertyOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYOF,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasIsMaterialPropertyOf() {
	   return !getIsMaterialPropertyOf().isEmpty();
    }

    public void addIsMaterialPropertyOf(WrappedIndividual newIsMaterialPropertyOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYOF,
                                       newIsMaterialPropertyOf);
    }

    public void removeIsMaterialPropertyOf(WrappedIndividual oldIsMaterialPropertyOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYOF,
                                          oldIsMaterialPropertyOf);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMaterialPropertyUsedBy
     */
     
    public Collection<? extends Solver> getIsMaterialPropertyUsedBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYUSEDBY,
                                               DefaultSolver.class);
    }

    public boolean hasIsMaterialPropertyUsedBy() {
	   return !getIsMaterialPropertyUsedBy().isEmpty();
    }

    public void addIsMaterialPropertyUsedBy(Solver newIsMaterialPropertyUsedBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYUSEDBY,
                                       newIsMaterialPropertyUsedBy);
    }

    public void removeIsMaterialPropertyUsedBy(Solver oldIsMaterialPropertyUsedBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISMATERIALPROPERTYUSEDBY,
                                          oldIsMaterialPropertyUsedBy);
    }


    /* ***************************************************
     * Data Property http://codata.jp/OML-Property.owl#MaximalValue
     */
     
    public Collection<? extends Object> getMaximalValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAXIMALVALUE, Object.class);
    }

    public boolean hasMaximalValue() {
		return !getMaximalValue().isEmpty();
    }

    public void addMaximalValue(Object newMaximalValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAXIMALVALUE, newMaximalValue);
    }

    public void removeMaximalValue(Object oldMaximalValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MAXIMALVALUE, oldMaximalValue);
    }


    /* ***************************************************
     * Data Property http://codata.jp/OML-Property.owl#MinimumValue
     */
     
    public Collection<? extends Object> getMinimumValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MINIMUMVALUE, Object.class);
    }

    public boolean hasMinimumValue() {
		return !getMinimumValue().isEmpty();
    }

    public void addMinimumValue(Object newMinimumValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MINIMUMVALUE, newMinimumValue);
    }

    public void removeMinimumValue(Object oldMinimumValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_MINIMUMVALUE, oldMinimumValue);
    }


    /* ***************************************************
     * Data Property http://codata.jp/OML-Property.owl#Value
     */
     
    public Collection<? extends Object> getValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUE, Object.class);
    }

    public boolean hasValue() {
		return !getValue().isEmpty();
    }

    public void addValue(Object newValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUE, newValue);
    }

    public void removeValue(Object oldValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_VALUE, oldValue);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasMaterialPropertyValue
     */
     
    public Collection<? extends Object> getHasMaterialPropertyValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATERIALPROPERTYVALUE, Object.class);
    }

    public boolean hasHasMaterialPropertyValue() {
		return !getHasMaterialPropertyValue().isEmpty();
    }

    public void addHasMaterialPropertyValue(Object newHasMaterialPropertyValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATERIALPROPERTYVALUE, newHasMaterialPropertyValue);
    }

    public void removeHasMaterialPropertyValue(Object oldHasMaterialPropertyValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATERIALPROPERTYVALUE, oldHasMaterialPropertyValue);
    }


}
