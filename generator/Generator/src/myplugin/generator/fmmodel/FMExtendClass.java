package myplugin.generator.fmmodel;

import java.util.ArrayList;

public class FMExtendClass extends FMType {
	private ArrayList<FMProperty> FMProperties = new ArrayList<FMProperty>();

	public FMExtendClass(String name, String typePackage, ArrayList<FMProperty> properties) {
		super(name, typePackage);
		this.FMProperties = properties;
	}
	
	

	public ArrayList<FMProperty> getProperties() {
		return FMProperties;
	}

	public void setProperties(ArrayList<FMProperty> properties) {
		this.FMProperties = properties;
	}
	

}
