package NEsysml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Stereotype;

public class AadlUtil {
	
//	private static final String prefix = "Esysml";
	
	public static final AadlUtil eINSTANCE = instance();
	private volatile static AadlUtil singleton;
	private AadlUtil (){}
	private static AadlUtil instance() {
		if (singleton == null) {
			synchronized (AadlUtil.class) {
				if (singleton == null) {
					singleton = new AadlUtil();
				}
			}
		}
		return singleton;
	}
	
	public String getQualifyName(EClass e) {
		if(e == null)
			return null;
		String prefix = getQualifyName(e.getEPackage());
		if(prefix == null)
			return e.getName();
		else
			return prefix + "::" + e.getName();
	}
	
	public String getQualifyName(EPackage e) {
		if(e == null)
			return null;
		String prefix = getQualifyName(e.getESuperPackage());
		if(prefix == null)
			return e.getName();
		else
			return prefix + "::" + e.getName();
	}
	
	public boolean includes(EList<Port> ports, String name) {
		for(Port p : ports)
			if(p.getName().equals(name))
				return true;
		return false;
	}
	
	public Port getPort(EList<Port> ports, String name) {
		for(Port p : ports)
			if(p.getName().equals(name))
				return p;
		return null;
	}
	
	
	/**
	 * get applicable stereotype of element e with type c. c must be in ESysml.
	 * Note: if e cannot be standalone, this function will return null if e hasn't been contained.
	 * @param e
	 * Element applicable by c
	 * @param c
	 * type of stereotype
	 * @return
	 * stereotype found
	 */
	private Stereotype getApplicableStereotype(Element e, EClass c) {
		return e.getApplicableStereotype((this.getQualifyName(c)));
	}
	
	public Stereotype getAppliedStereotype(Element e, EClass c) {
		return e.getAppliedStereotype((this.getQualifyName(c)));
	}
	
	public EObject applyStereotype(Element e, EClass c) {
		return e.applyStereotype(getApplicableStereotype(e,c));
	}
	
	public EObject getStereotypeApplication(Element e, EClass c) {
		Stereotype s = getAppliedStereotype(e, c);
		if(s == null)
			return null;
		return e.getStereotypeApplication(s);
	}
	
	public boolean isStereotypedBy(Element e, EClass c) {
		return getAppliedStereotype(e, c) != null;
	}
}
