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
 * Source Class: DefaultNode <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */
public class DefaultNode extends WrappedIndividualImpl implements Node {

    public DefaultNode(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#hasNodeSettings
     */
     
    public Collection<? extends NodeSettings> getHasNodeSettings() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASNODESETTINGS,
                                               DefaultNodeSettings.class);
    }

    public boolean hasHasNodeSettings() {
	   return !getHasNodeSettings().isEmpty();
    }

    public void addHasNodeSettings(NodeSettings newHasNodeSettings) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASNODESETTINGS,
                                       newHasNodeSettings);
    }

    public void removeHasNodeSettings(NodeSettings oldHasNodeSettings) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASNODESETTINGS,
                                          oldHasNodeSettings);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isBoundaryNodeOf
     */
     
    public Collection<? extends Boundary> getIsBoundaryNodeOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISBOUNDARYNODEOF,
                                               DefaultBoundary.class);
    }

    public boolean hasIsBoundaryNodeOf() {
	   return !getIsBoundaryNodeOf().isEmpty();
    }

    public void addIsBoundaryNodeOf(Boundary newIsBoundaryNodeOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISBOUNDARYNODEOF,
                                       newIsBoundaryNodeOf);
    }

    public void removeIsBoundaryNodeOf(Boundary oldIsBoundaryNodeOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISBOUNDARYNODEOF,
                                          oldIsBoundaryNodeOf);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isNodeOf
     */
     
    public Collection<? extends Subdomain> getIsNodeOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISNODEOF,
                                               DefaultSubdomain.class);
    }

    public boolean hasIsNodeOf() {
	   return !getIsNodeOf().isEmpty();
    }

    public void addIsNodeOf(Subdomain newIsNodeOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISNODEOF,
                                       newIsNodeOf);
    }

    public void removeIsNodeOf(Subdomain oldIsNodeOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISNODEOF,
                                          oldIsNodeOf);
    }


    /* ***************************************************
     * Object Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isVertexOf
     */
     
    public Collection<? extends Subdomain_group> getIsVertexOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISVERTEXOF,
                                               DefaultSubdomain_group.class);
    }

    public boolean hasIsVertexOf() {
	   return !getIsVertexOf().isEmpty();
    }

    public void addIsVertexOf(Subdomain_group newIsVertexOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISVERTEXOF,
                                       newIsVertexOf);
    }

    public void removeIsVertexOf(Subdomain_group oldIsVertexOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISVERTEXOF,
                                          oldIsVertexOf);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasNodeID
     */
     
    public Collection<? extends Integer> getHasNodeID() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNODEID, Integer.class);
    }

    public boolean hasHasNodeID() {
		return !getHasNodeID().isEmpty();
    }

    public void addHasNodeID(Integer newHasNodeID) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNODEID, newHasNodeID);
    }

    public void removeHasNodeID(Integer oldHasNodeID) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNODEID, oldHasNodeID);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasXCoordinate
     */
     
    public Collection<? extends Object> getHasXCoordinate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASXCOORDINATE, Object.class);
    }

    public boolean hasHasXCoordinate() {
		return !getHasXCoordinate().isEmpty();
    }

    public void addHasXCoordinate(Object newHasXCoordinate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASXCOORDINATE, newHasXCoordinate);
    }

    public void removeHasXCoordinate(Object oldHasXCoordinate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASXCOORDINATE, oldHasXCoordinate);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasYCoordinate
     */
     
    public Collection<? extends Object> getHasYCoordinate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASYCOORDINATE, Object.class);
    }

    public boolean hasHasYCoordinate() {
		return !getHasYCoordinate().isEmpty();
    }

    public void addHasYCoordinate(Object newHasYCoordinate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASYCOORDINATE, newHasYCoordinate);
    }

    public void removeHasYCoordinate(Object oldHasYCoordinate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASYCOORDINATE, oldHasYCoordinate);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#hasZCoordinate
     */
     
    public Collection<? extends Object> getHasZCoordinate() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZCOORDINATE, Object.class);
    }

    public boolean hasHasZCoordinate() {
		return !getHasZCoordinate().isEmpty();
    }

    public void addHasZCoordinate(Object newHasZCoordinate) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZCOORDINATE, newHasZCoordinate);
    }

    public void removeHasZCoordinate(Object oldHasZCoordinate) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASZCOORDINATE, oldHasZCoordinate);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isCentralNode
     */
     
    public Collection<? extends Boolean> getIsCentralNode() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCENTRALNODE, Boolean.class);
    }

    public boolean hasIsCentralNode() {
		return !getIsCentralNode().isEmpty();
    }

    public void addIsCentralNode(Boolean newIsCentralNode) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCENTRALNODE, newIsCentralNode);
    }

    public void removeIsCentralNode(Boolean oldIsCentralNode) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISCENTRALNODE, oldIsCentralNode);
    }


    /* ***************************************************
     * Data Property http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#isMidNode
     */
     
    public Collection<? extends Boolean> getIsMidNode() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISMIDNODE, Boolean.class);
    }

    public boolean hasIsMidNode() {
		return !getIsMidNode().isEmpty();
    }

    public void addIsMidNode(Boolean newIsMidNode) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISMIDNODE, newIsMidNode);
    }

    public void removeIsMidNode(Boolean oldIsMidNode) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ISMIDNODE, oldIsMidNode);
    }


}