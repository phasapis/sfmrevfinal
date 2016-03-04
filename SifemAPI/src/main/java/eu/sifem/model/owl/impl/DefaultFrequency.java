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
 * Source Class: DefaultFrequency <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultFrequency extends WrappedIndividualImpl implements Frequency {

    public DefaultFrequency(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasBoundaryCondition
     */
     
    public Collection<? extends Boundary_Condition> getHasBoundaryCondition() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBOUNDARYCONDITION,
                                               DefaultBoundary_Condition.class);
    }

    public boolean hasHasBoundaryCondition() {
	   return !getHasBoundaryCondition().isEmpty();
    }

    public void addHasBoundaryCondition(Boundary_Condition newHasBoundaryCondition) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBOUNDARYCONDITION,
                                       newHasBoundaryCondition);
    }

    public void removeHasBoundaryCondition(Boundary_Condition oldHasBoundaryCondition) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBOUNDARYCONDITION,
                                          oldHasBoundaryCondition);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasValueHeldBy
     */
     
    public Collection<? extends WrappedIndividual> getHasValueHeldBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASVALUEHELDBY,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasValueHeldBy() {
	   return !getHasValueHeldBy().isEmpty();
    }

    public void addHasValueHeldBy(WrappedIndividual newHasValueHeldBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASVALUEHELDBY,
                                       newHasValueHeldBy);
    }

    public void removeHasValueHeldBy(WrappedIndividual oldHasValueHeldBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASVALUEHELDBY,
                                          oldHasValueHeldBy);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isInputOfApplied
     */
     
    public Collection<? extends Solver> getIsInputOfApplied() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISINPUTOFAPPLIED,
                                               DefaultSolver.class);
    }

    public boolean hasIsInputOfApplied() {
	   return !getIsInputOfApplied().isEmpty();
    }

    public void addIsInputOfApplied(Solver newIsInputOfApplied) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISINPUTOFAPPLIED,
                                       newIsInputOfApplied);
    }

    public void removeIsInputOfApplied(Solver oldIsInputOfApplied) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISINPUTOFAPPLIED,
                                          oldIsInputOfApplied);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isConstrained
     */
     
    public Collection<? extends Boolean> getIsConstrained() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCONSTRAINED, Boolean.class);
    }

    public boolean hasIsConstrained() {
		return !getIsConstrained().isEmpty();
    }

    public void addIsConstrained(Boolean newIsConstrained) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCONSTRAINED, newIsConstrained);
    }

    public void removeIsConstrained(Boolean oldIsConstrained) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCONSTRAINED, oldIsConstrained);
    }


}
