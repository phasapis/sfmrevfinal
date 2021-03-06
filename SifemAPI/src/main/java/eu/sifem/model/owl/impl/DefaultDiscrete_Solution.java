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
 * Source Class: DefaultDiscrete_Solution <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultDiscrete_Solution extends WrappedIndividualImpl implements Discrete_Solution {

    public DefaultDiscrete_Solution(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isDiscreteSolutionOf
     */
     
    public Collection<? extends Discrete_Model> getIsDiscreteSolutionOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISDISCRETESOLUTIONOF,
                                               DefaultDiscrete_Model.class);
    }

    public boolean hasIsDiscreteSolutionOf() {
	   return !getIsDiscreteSolutionOf().isEmpty();
    }

    public void addIsDiscreteSolutionOf(Discrete_Model newIsDiscreteSolutionOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISDISCRETESOLUTIONOF,
                                       newIsDiscreteSolutionOf);
    }

    public void removeIsDiscreteSolutionOf(Discrete_Model oldIsDiscreteSolutionOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISDISCRETESOLUTIONOF,
                                          oldIsDiscreteSolutionOf);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isSimulatedBy
     */
     
    public Collection<? extends WrappedIndividual> getIsSimulatedBy() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISSIMULATEDBY,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasIsSimulatedBy() {
	   return !getIsSimulatedBy().isEmpty();
    }

    public void addIsSimulatedBy(WrappedIndividual newIsSimulatedBy) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISSIMULATEDBY,
                                       newIsSimulatedBy);
    }

    public void removeIsSimulatedBy(WrappedIndividual oldIsSimulatedBy) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISSIMULATEDBY,
                                          oldIsSimulatedBy);
    }


}
