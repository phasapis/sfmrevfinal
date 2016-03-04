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
 * Source Class: DefaultVectorValue <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultVectorValue extends WrappedIndividualImpl implements VectorValue {

    public DefaultVectorValue(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/Simulation.owl#hasInputStatus
     */
     
    public Collection<? extends Object> getHasInputStatus() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINPUTSTATUS, Object.class);
    }

    public boolean hasHasInputStatus() {
		return !getHasInputStatus().isEmpty();
    }

    public void addHasInputStatus(Object newHasInputStatus) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINPUTSTATUS, newHasInputStatus);
    }

    public void removeHasInputStatus(Object oldHasInputStatus) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINPUTSTATUS, oldHasInputStatus);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/Simulation.owl#hasVectorDataValue
     */
     
    public Collection<? extends Object> getHasVectorDataValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVECTORDATAVALUE, Object.class);
    }

    public boolean hasHasVectorDataValue() {
		return !getHasVectorDataValue().isEmpty();
    }

    public void addHasVectorDataValue(Object newHasVectorDataValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVECTORDATAVALUE, newHasVectorDataValue);
    }

    public void removeHasVectorDataValue(Object oldHasVectorDataValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVECTORDATAVALUE, oldHasVectorDataValue);
    }


}
