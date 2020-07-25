package myplugin.generator.fmmodel;

public class UIClass {

	private String label;
	private Boolean create;
	private Boolean read;
	private Boolean update;
	private Boolean delete;

	public UIClass(String label, Boolean create, Boolean read, Boolean update, Boolean delete) {
		super();
		this.label = label;
		this.create = create;
		this.read = read;
		this.update = update;
		this.delete = delete;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getCreate() {
		return create;
	}

	public void setCreate(Boolean create) {
		this.create = create;
	}

	public Boolean getRead() {
		return read;
	}

	public void setRead(Boolean read) {
		this.read = read;
	}

	public Boolean getUpdate() {
		return update;
	}

	public void setUpdate(Boolean update) {
		this.update = update;
	}

	public Boolean getDelete() {
		return delete;
	}

	public void setDelete(Boolean delete) {
		this.delete = delete;
	}
	
}
