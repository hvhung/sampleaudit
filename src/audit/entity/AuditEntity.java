package audit.entity;

import java.util.Date;

public class AuditEntity {

	private String name;
	private String type;
	private String subType;
	private String eventData;
	private Date auditDate;
	
	private AuditEntity(EntityBuilder builder) {
		this.name = builder.name;
		this.type = builder.type;
		this.subType = builder.subType;
		this.eventData = builder.eventData;
		this.auditDate = builder.auditDate;
	}
	
	public static class EntityBuilder {
		private String name;
		private String type;
		private String subType;
		private String eventData;
		private Date auditDate;
		
		public AuditEntity build() {
			this.auditDate = new Date();
			return new AuditEntity(this);
		}
		
		public EntityBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public EntityBuilder setType(String type) {
			this.type = type;
			return this;
		}
		
		public EntityBuilder setSubType(String subType) {
			this.subType = subType;
			return this;
		}
		
		public EntityBuilder setEventData(String eventData) {
			this.eventData = eventData;
			return this;
		}
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getSubType() {
		return subType;
	}
	public String getEventData() {
		return eventData;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	
	
}
