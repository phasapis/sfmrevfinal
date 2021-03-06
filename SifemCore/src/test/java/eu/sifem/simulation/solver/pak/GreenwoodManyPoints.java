package eu.sifem.simulation.solver.pak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hp.hpl.jena.rdf.model.RDFNode;

import eu.sifem.dao.jena.JenaModel;
import eu.sifem.featurextraction.FeatureExtractor;


public class GreenwoodManyPoints {

	public static void main(String[] args) {	
		JenaModel model = new JenaModel();
		model.importDataService("C:/SifemWindowsResourceFiles/dataset/sifemData.nq");	
		
		
		
		
		Set<String> namedGraphNames = new HashSet<String>();
		namedGraphNames.add("simulationNumber_0");
		namedGraphNames.add("simulationNumber_1");
		namedGraphNames.add("simulationNumber_2");

		String simulationName = "replaceIt";
		String query = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
				"PREFIX owl: <http://www.w3.org/2002/07/owl#>\n"+
				"PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\n"+
				"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"+
				"PREFIX fem: <http://www.sifemontologies.com/ontologies/FiniteElementModel.owl#>\n"+
				"PREFIX pak: <http://www.sifemontologies.com/ontologies/FEMSettingsPAK.owl#>\n"+
				"PREFIX sim: <http://www.sifemontologies.com/ontologies/Simulation.owl#>\n"+
				"SELECT ?material ?materialType ?node ?xCoord ?yCoord ?zCoord ?translationX ?translationY ?translationZ ?subDomain ?id ?excitationFreqVal" + 
				"WHERE { GRAPH <http://www.sifemontologies.com/ontologies/SimulationInstance/"+simulationName+"> { ?material rdf:type fem:Material . ?material fem:hasMaterialNumber ?y .    ?material pak:hasMaterialSettings ?z .  ?z pak:MATTYPE ?materialType.  ?node rdf:type fem:Node .  " +
				"?node fem:isNodeOf ?subDomain. ?node fem:hasNodeID ?id. ?subDomain fem:makesUp ?subDomainGroup. ?subDomainGroup fem:hasMaterial ?material. ?node fem:hasXCoordinate ?xCoord . ?node fem:hasYCoordinate ?yCoord . ?node fem:hasZCoordinate ?zCoord . ?node fem:holdsValueFor ?b . ?b rdf:type fem:Translation. ?b sim:hasVectorValue ?a . ?a sim:isReal true . ?a sim:hasVectorXValue ?translationX . ?a sim:hasVectorYValue ?translationY . ?a sim:hasVectorZValue ?translationZ .  "
				+ "?loadResource rdf:type fem:Load. ?loadResource fem:holdsValueFor ?excitationFreq. ?excitationFreq rdf:type fem:Frequency. "
				+ "?excitationFreq sim:hasScalarValue ?excitationFreqValObj. ?excitationFreqValObj sim:hasScalarDataValue ?excitationFreqVal. "
				+ "}} " +
				"";
		
		
		List<String> queryVariables = new ArrayList<String>();
		queryVariables.add("material");queryVariables.add("materialType");queryVariables.add("node");
		queryVariables.add("xCoord");queryVariables.add("yCoord");queryVariables.add("zCoord");
		queryVariables.add("translationX");queryVariables.add("translationY");queryVariables.add("translationZ");
		queryVariables.add("subDomain");queryVariables.add("id");queryVariables.add("excitationFreqVal");
		List<Double> datax = new ArrayList<Double>();
		List<Double> datay = new ArrayList<Double>();

		for(String namedGraphName : namedGraphNames){
			query = query.replace("replaceIt", namedGraphName);
			System.out.println(query);
			Map<String, List<RDFNode>> queryModel = model.queryModelService(query, queryVariables);		
			List<RDFNode> xCoords = queryModel.get(queryVariables.get(3));
			List<RDFNode> translationXs = queryModel.get(queryVariables.get(6));
			List<RDFNode> ids = queryModel.get(queryVariables.get(10));
			List<RDFNode> frequencyVals = queryModel.get(queryVariables.get(11));
			double excitationFreq = frequencyVals.get(0).asLiteral().getDouble();
			double maxDisplacement = Double.MIN_VALUE;
			double xCoordWithMaxDisplacement = Double.MIN_VALUE;
			for(int i=0; i<ids.size(); i++){
				double displacementX =  translationXs.get(i).asLiteral().getDouble();
				if(displacementX < 0.0)
					displacementX = displacementX * -1;
				if(displacementX > maxDisplacement){
					maxDisplacement = displacementX;
					xCoordWithMaxDisplacement = xCoords.get(i).asLiteral().getDouble();
				}				
			}	
			datax.add(excitationFreq);				
			datay.add(xCoordWithMaxDisplacement);
		}
		FeatureExtractor f = new FeatureExtractor();
		List<Double> xdata = new ArrayList<Double>(datax);
		Collections.sort(xdata);
		List<Double> dataxVals = new ArrayList<Double>();
		List<Double> datayVals = new ArrayList<Double>();

		for(Double xval : xdata) {
			int index = datax.indexOf(xval);			
			dataxVals.add(Math.log10(xval));
			datayVals.add(datay.get(index));
		}

		System.out.println("Frequency" + " , " + "PositionOfHairCell");
		int i = 0;
		for(double x : dataxVals){
			double basillarDistance = dataxVals.get(i);
			double xDisplacement = datayVals.get(i);
			System.out.println(basillarDistance + " , " + xDisplacement);
			i++;
		}

//		f.plot2dGFeat(dataxVals, "Frequency", datayVals, "PositionOfHairCell", "GreenWood", "/Users/kartik/Work/Workspaces/Workspaces/SIFEM/Sifem/SifemCore/src/test/resources/", false, true,				
//				"o", "Greenwood");

	}
}
