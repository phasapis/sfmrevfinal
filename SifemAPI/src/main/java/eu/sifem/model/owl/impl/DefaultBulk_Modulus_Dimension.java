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
 * Source Class: DefaultBulk_Modulus_Dimension <br>
 * @version generated on Mon May 11 16:25:19 BST 2015 by jbjares
 */
public class DefaultBulk_Modulus_Dimension extends WrappedIndividualImpl implements Bulk_Modulus_Dimension {

    public DefaultBulk_Modulus_Dimension(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isDimensionOf
     */
     
    public Collection<? extends WrappedIndividual> getIsDimensionOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISDIMENSIONOF,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasIsDimensionOf() {
	   return !getIsDimensionOf().isEmpty();
    }

    public void addIsDimensionOf(WrappedIndividual newIsDimensionOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISDIMENSIONOF,
                                       newIsDimensionOf);
    }

    public void removeIsDimensionOf(WrappedIndividual oldIsDimensionOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISDIMENSIONOF,
                                          oldIsDimensionOf);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasDimensionDataProperty
     */
     
    public Collection<? extends Object> getHasDimensionDataProperty() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDIMENSIONDATAPROPERTY, Object.class);
    }

    public boolean hasHasDimensionDataProperty() {
		return !getHasDimensionDataProperty().isEmpty();
    }

    public void addHasDimensionDataProperty(Object newHasDimensionDataProperty) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDIMENSIONDATAPROPERTY, newHasDimensionDataProperty);
    }

    public void removeHasDimensionDataProperty(Object oldHasDimensionDataProperty) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDIMENSIONDATAPROPERTY, oldHasDimensionDataProperty);
    }


}
