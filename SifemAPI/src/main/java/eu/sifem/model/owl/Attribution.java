package eu.sifem.model.owl;

import java.util.Collection;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Attribution <br>
 * @version generated on Mon May 11 16:25:20 BST 2015 by jbjares
 */

public interface Attribution extends AgentInfluence {

    /* ***************************************************
     * Property http://www.w3.org/ns/prov#agent
     */
     
    /**
     * Gets all property values for the agent property.<p>
     * 
     * @returns a collection of values for the agent property.
     */
    Collection<? extends Agent> getAgent();

    /**
     * Checks if the class has a agent property value.<p>
     * 
     * @return true if there is a agent property value.
     */
    boolean hasAgent();

    /**
     * Adds a agent property value.<p>
     * 
     * @param newAgent the agent property value to be added
     */
    void addAgent(Agent newAgent);

    /**
     * Removes a agent property value.<p>
     * 
     * @param oldAgent the agent property value to be removed.
     */
    void removeAgent(Agent oldAgent);


    /* ***************************************************
     * Property http://www.w3.org/ns/prov#hadActivity
     */
     
    /**
     * Gets all property values for the hadActivity property.<p>
     * 
     * @returns a collection of values for the hadActivity property.
     */
    Collection<? extends Activity> getHadActivity();

    /**
     * Checks if the class has a hadActivity property value.<p>
     * 
     * @return true if there is a hadActivity property value.
     */
    boolean hasHadActivity();

    /**
     * Adds a hadActivity property value.<p>
     * 
     * @param newHadActivity the hadActivity property value to be added
     */
    void addHadActivity(Activity newHadActivity);

    /**
     * Removes a hadActivity property value.<p>
     * 
     * @param oldHadActivity the hadActivity property value to be removed.
     */
    void removeHadActivity(Activity oldHadActivity);


    /* ***************************************************
     * Property http://www.w3.org/ns/prov#hadRole
     */
     
    /**
     * Gets all property values for the hadRole property.<p>
     * 
     * @returns a collection of values for the hadRole property.
     */
    Collection<? extends Role> getHadRole();

    /**
     * Checks if the class has a hadRole property value.<p>
     * 
     * @return true if there is a hadRole property value.
     */
    boolean hasHadRole();

    /**
     * Adds a hadRole property value.<p>
     * 
     * @param newHadRole the hadRole property value to be added
     */
    void addHadRole(Role newHadRole);

    /**
     * Removes a hadRole property value.<p>
     * 
     * @param oldHadRole the hadRole property value to be removed.
     */
    void removeHadRole(Role oldHadRole);


    /* ***************************************************
     * Property http://www.w3.org/ns/prov#influencer
     */
     
    /**
     * Gets all property values for the influencer property.<p>
     * 
     * @returns a collection of values for the influencer property.
     */
    Collection<? extends WrappedIndividual> getInfluencer();

    /**
     * Checks if the class has a influencer property value.<p>
     * 
     * @return true if there is a influencer property value.
     */
    boolean hasInfluencer();

    /**
     * Adds a influencer property value.<p>
     * 
     * @param newInfluencer the influencer property value to be added
     */
    void addInfluencer(WrappedIndividual newInfluencer);

    /**
     * Removes a influencer property value.<p>
     * 
     * @param oldInfluencer the influencer property value to be removed.
     */
    void removeInfluencer(WrappedIndividual oldInfluencer);


    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
