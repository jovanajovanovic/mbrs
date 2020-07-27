package myplugin.generator.fmmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FMClass extends FMType {	
	
	private String visibility;
	private List<FMProperty> FMProperties = new ArrayList<FMProperty>();
	private List<String> importedPackages = new ArrayList<String>();
	private String label;
	private UIClass uiClass = null;
	
	//parent
//	private FMExtendClass baseClassifier;

	
	public FMClass(String name, String classPackage, String visibility) {
		super(name, classPackage);		
		this.visibility = visibility;
//		this.baseClassifier = base;
	}	
	
	public List<FMProperty> getProperties(){
		return FMProperties;
	}
	
	public Iterator<FMProperty> getPropertyIterator(){
		return FMProperties.iterator();
	}
	
	public void addProperty(FMProperty property){
		FMProperties.add(property);		
	}
	
	public int getPropertyCount(){
		return FMProperties.size();
	}
	
	public List<String> getImportedPackages(){
		return importedPackages;
	}

	public Iterator<String> getImportedIterator(){
		return importedPackages.iterator();
	}
	
	public void addImportedPackage(String importedPackage){
		importedPackages.add(importedPackage);		
	}
	
	public int getImportedCount(){
		return FMProperties.size();
	}
	
	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

//	
//	public FMExtendClass getBaseClassifier() {
//		return baseClassifier;
//	}
//
//	public void setBaseClassifier(FMExtendClass baseClassifier) {
//		this.baseClassifier = baseClassifier;
//	}

	public UIClass getUiClass() {
		return uiClass;
	}

	public void setUiClass(UIClass uiClass) {
		this.uiClass = uiClass;
	}

	@Override
	public String toString() {
		return "FMClass [visibility=" + visibility + ", FMProperties=" + FMProperties + ", importedPackages="
				+ importedPackages + ", label=" + label + ", toString()=" + super.toString() + "]";
	}
	

	
}
