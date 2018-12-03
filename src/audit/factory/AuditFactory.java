package audit.factory;

import audit.strategy.AddDocumentStrategy;
import audit.strategy.AuditStrategy;

public abstract class AuditFactory {

	public static AuditStrategy getInstance(String auditName) {
		AuditStrategy auditStrategy = null;
		
		switch(auditName) {
		case "ADD_DOCUMENT":
			auditStrategy = new AddDocumentStrategy();
			break;
		default:
			break;
		}
		
		return auditStrategy;
	}
	
}
