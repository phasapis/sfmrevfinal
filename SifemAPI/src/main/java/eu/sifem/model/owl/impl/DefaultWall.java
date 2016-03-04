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
 * Source Class: DefaultWall <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultWall extends WrappedIndividualImpl implements Wall {

    public DefaultWall(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasBoundarySettings
     */
     
    public Collection<? extends WrappedIndividual> getHasBoundarySettings() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBOUNDARYSETTINGS,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasHasBoundarySettings() {
	   return !getHasBoundarySettings().isEmpty();
    }

    public void addHasBoundarySettings(WrappedIndividual newHasBoundarySettings) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBOUNDARYSETTINGS,
                                       newHasBoundarySettings);
    }

    public void removeHasBoundarySettings(WrappedIndividual oldHasBoundarySettings) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBOUNDARYSETTINGS,
                                          oldHasBoundarySettings);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasBoundaryNode
     */
     
    public Collection<? extends Node> getHasBoundaryNode() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASBOUNDARYNODE,
                                               DefaultNode.class);
    }

    public boolean hasHasBoundaryNode() {
	   return !getHasBoundaryNode().isEmpty();
    }

    public void addHasBoundaryNode(Node newHasBoundaryNode) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASBOUNDARYNODE,
                                       newHasBoundaryNode);
    }

    public void removeHasBoundaryNode(Node oldHasBoundaryNode) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASBOUNDARYNODE,
                                          oldHasBoundaryNode);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isBoundaryOf
     */
     
    public Collection<? extends WrappedIndividual> getIsBoundaryOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISBOUNDARYOF,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasIsBoundaryOf() {
	   return !getIsBoundaryOf().isEmpty();
    }

    public void addIsBoundaryOf(WrappedIndividual newIsBoundaryOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISBOUNDARYOF,
                                       newIsBoundaryOf);
    }

    public void removeIsBoundaryOf(WrappedIndividual oldIsBoundaryOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISBOUNDARYOF,
                                          oldIsBoundaryOf);
    }


}