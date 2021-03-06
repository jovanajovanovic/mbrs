package myplugin.generator.fmmodel;


public class FMProperty extends FMElement  {
	//Property type
	private FMType type;
	// Property visibility (public, private, protected, package)
	private String visibility;
	//Multiplicity (lower value)
	private Integer lower;
	//Multiplicity (upper value) 
	private Integer upper;
	
	private Boolean association;
	private String aggregationKind;
	private String associationend;
	
	private Boolean hidden;
	private Boolean findBy;
	private Validation validation;
	private UIProperty uiProperty;
	
	/** @param associtaionend 
	 * @ToDo: Add length, precision, unique... whatever is needed for ejb class generation
	 * Also, provide these meta-attributes or tags in the modeling languange metaclass or 
	 * stereotype */
	
	public FMProperty(String name, FMType type, String visibility, int lower, int upper, Boolean association,
			String aggregationKind, String associtaionend) {
		super(name);
		this.type = type;
		this.visibility = visibility;
		this.lower = lower;
		this.upper = upper;
		this.association = association;
		this.aggregationKind = aggregationKind;
		this.associationend = associtaionend;
	}
	
	public FMType getType() {
		return type;
	}
	public void setType(FMType type) {
		this.type = type;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
	
	public Integer getLower() {
		return lower;
	}

	public void setLower(Integer lower) {
		this.lower = lower;
	}

	public Integer getUpper() {
		return upper;
	}

	public void setUpper(Integer upper) {
		this.upper = upper;
	}

	public Boolean getAssociation() {
		return association;
	}

	public void setAssociation(Boolean association) {
		this.association = association;
	}

	public String getAggregationKind() {
		return aggregationKind;
	}

	public void setAggregationKind(String aggregationKind) {
		this.aggregationKind = aggregationKind;
	}

	public String getAssociationend() {
		return associationend;
	}

	public void setAssociationend(String associationend) {
		this.associationend = associationend;
	}
	
	public UIProperty getUiProperty() {
		return uiProperty;
	}

	public void setUiProperty(UIProperty uiProperty) {
		this.uiProperty = uiProperty;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public Boolean getFindBy() {
		return findBy;
	}

	public void setFindBy(Boolean findBy) {
		this.findBy = findBy;
	}

	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}
	

}
