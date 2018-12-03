package audit.entity;

import java.io.Serializable;
import java.util.Date;

public class Document implements Serializable {

	private static final long serialVersionUID = 1L;
	private String documentName;
	private String description;
	private Date createdDate;
	private String createdUser;
	private Date modifiedDate;
	private String modifiedUser;
	
	
	public String getDocumentName() {
		return documentName;
	}
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	
	@Override
	public String toString() {
		return "Document [documentName=" + documentName + ", description=" + description + ", createdDate="
				+ createdDate + ", createdUser=" + createdUser + ", modifiedDate=" + modifiedDate + ", modifiedUser="
				+ modifiedUser + "]";
	}
	
}
