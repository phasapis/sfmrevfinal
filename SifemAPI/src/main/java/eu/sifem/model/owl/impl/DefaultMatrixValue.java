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
 * Source Class: DefaultMatrixValue <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultMatrixValue extends WrappedIndividualImpl implements MatrixValue {

    public DefaultMatrixValue(CodeGenerationInference inference, IRI iri) {
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
     * Data Property http://www.sifemontologies.com/ontologies/Simulation.owl#hasMatrixDataValue
     */
     
    public Collection<? extends Object> getHasMatrixDataValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATRIXDATAVALUE, Object.class);
    }

    public boolean hasHasMatrixDataValue() {
		return !getHasMatrixDataValue().isEmpty();
    }

    public void addHasMatrixDataValue(Object newHasMatrixDataValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATRIXDATAVALUE, newHasMatrixDataValue);
    }

    public void removeHasMatrixDataValue(Object oldHasMatrixDataValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASMATRIXDATAVALUE, oldHasMatrixDataValue);
    }


}
