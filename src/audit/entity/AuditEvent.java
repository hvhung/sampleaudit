package audit.entity;

import java.util.Date;


public class AuditEvent {

	private String name;
	private String description;
	private String type;
	private String subType;
	private String eventData;
	private Date auditDate;
	
	public AuditEvent(Builder builder) {
		this.name = builder.name;
		this.description = builder.description;
		this.type = builder.type;
		this.subType = builder.subType;
		this.eventData = builder.eventData;
		this.auditDate = builder.auditDate;
	}
	
	public static class Builder {
		private String name;
		private String description;
		private String type;
		private String subType;
		private String eventData;
		private Date auditDate;
		
		public AuditEvent build() {
			this.auditDate = new Date();
			return new AuditEvent(this);
		}
		
		public Builder setName(String value) {
			this.name = value;
			return this;
		}
		
		public Builder setDescription(String value) {
			this.description = value;
			return this;
		}
		
		public Builder setType(String value) {
			this.type = value;
			return this;
		}
		
		public Builder setSubType(String value) {
			this.subType = value;
			return this;
		}
		
		public Builder setEventData(String value) {
			this.eventData = value;
			return this;
		}
	}
}
