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
 * Source Class: DefaultMaterial_Property <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultMaterial_Property extends WrappedIndividualImpl implements Material_Property {

    public DefaultMaterial_Property(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
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