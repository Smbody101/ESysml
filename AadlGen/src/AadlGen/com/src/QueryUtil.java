package AadlGen.com.src;

import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.NamedElement;

public class QueryUtil {
	
//	public static boolean isProcess(EClass c) {
//		for(EClass s : c.getEAllSuperTypes())
//			if(s.getName().equals("Process"))
//				return true;
//		return false;
//		
//	}
//	
//	public static String getComponentTypeName(EClass c) {
//		if(isProcess(c))
//			return "Process";
//		return "unknown";
//	}
	
	public static String getPackageReferenceName(AadlPackage context, NamedElement c) {
		if(context.getOwnedPublicSection() == null)
			return "";
		
		if(includes(context, c))
			return "";
		
		for(ModelUnit m : context.getOwnedPublicSection().getImportedUnits()) {
			if(includes((AadlPackage)m,c))
				return m.getName() + "::";
		}
		return "ErrorClassifier" + "::";
	}
	
	public static boolean includes(AadlPackage p, NamedElement c) {
		if(p.getOwnedPublicSection() == null)
			return false;
		if(p.getOwnedPublicSection().getOwnedClassifiers().contains(c))
			return true;
		for(AnnexLibrary lib : p.getOwnedPublicSection().getOwnedAnnexLibraries()) {
			if(lib.getOwnedElements().contains(c));
				return true;
		}
		return false;
	}
	
//	public static boolean hasFeatures(ComponentType type) {
//		System.out.println(type.getOwnedFeature().size());
//		return true;
//	}

}
