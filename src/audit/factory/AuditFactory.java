package audit.factory;

import audit.entity.AuditEntity;

public abstract class AuditFactory {

	private AuditEntity auditEntity;
	
	protected abstract String createEventData();

	/**
	 * create auditEvent
	 * 
	 * @return create success or not
	 */
	public boolean createAudit() {
		
		return false;
	}
	
	@Override
	public String toString() {
		return " - Name: " + auditEntity.getName() +
				"\n - Type: " + auditEntity.getType() +
				"\n - Sub type: " + auditEntity.getSubType() +
				"\n - Event data: " + auditEntity.getEventData() +
				"\n - Audit date: " + auditEntity.getAuditDate();
	}

	public AuditEntity getAuditEntity() {
		return auditEntity;
	}

	public void setAuditEntity(AuditEntity auditEntity) {
		this.auditEntity = auditEntity;
	}
	
}
