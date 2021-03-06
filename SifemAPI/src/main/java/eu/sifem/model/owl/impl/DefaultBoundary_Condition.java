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
 * Source Class: DefaultBoundary_Condition <br>
 * @version generated on Mon May 11 16:25:19 BST 2015 by jbjares
 */
public class DefaultBoundary_Condition extends WrappedIndividualImpl implements Boundary_Condition {

    public DefaultBoundary_Condition(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isBoundaryConditionOf
     */
     
    public Collection<? extends Physical_Attribute> getIsBoundaryConditionOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISBOUNDARYCONDITIONOF,
                                               DefaultPhysical_Attribute.class);
    }

    public boolean hasIsBoundaryConditionOf() {
	   return !getIsBoundaryConditionOf().isEmpty();
    }

    public void addIsBoundaryConditionOf(Physical_Attribute newIsBoundaryConditionOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISBOUNDARYCONDITIONOF,
                                       newIsBoundaryConditionOf);
    }

    public void removeIsBoundaryConditionOf(Physical_Attribute oldIsBoundaryConditionOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISBOUNDARYCONDITIONOF,
                                          oldIsBoundaryConditionOf);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasMultiplier
     */
     
    public Collection<? extends Object> getHasMultiplier() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMULTIPLIER, Object.class);
    }

    public boolean hasHasMultiplier() {
		return !getHasMultiplier().isEmpty();
    }

    public void addHasMultiplier(Object newHasMultiplier) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMULTIPLIER, newHasMultiplier);
    }

    public void removeHasMultiplier(Object oldHasMultiplier) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMULTIPLIER, oldHasMultiplier);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasPatchCondition
     */
     
    public Collection<? extends Object> getHasPatchCondition() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPATCHCONDITION, Object.class);
    }

    public boolean hasHasPatchCondition() {
		return !getHasPatchCondition().isEmpty();
    }

    public void addHasPatchCondition(Object newHasPatchCondition) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPATCHCONDITION, newHasPatchCondition);
    }

    public void removeHasPatchCondition(Object oldHasPatchCondition) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASPATCHCONDITION, oldHasPatchCondition);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasTimeFunction
     */
     
    public Collection<? extends Object> getHasTimeFunction() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASTIMEFUNCTION, Object.class);
    }

    public boolean hasHasTimeFunction() {
		return !getHasTimeFunction().isEmpty();
    }

    public void addHasTimeFunction(Object newHasTimeFunction) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASTIMEFUNCTION, newHasTimeFunction);
    }

    public void removeHasTimeFunction(Object oldHasTimeFunction) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASTIMEFUNCTION, oldHasTimeFunction);
    }


}
