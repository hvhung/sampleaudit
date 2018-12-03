package audit;

import java.util.Date;

import audit.entity.Document;
import audit.factory.AuditFactory;
import audit.strategy.AuditStrategy;
import audit.utils.AuditUtils;

public class Main {

	public static void main(String[] args) {
		testMethod();
	}
	
	private static void sample() {
		String name = "ADD_DOCUMENT";
		String type = "ADD";
		String subType = "DOCUMENT";
		
		AuditStrategy auditStrategy = AuditFactory.getInstance(name);
		
		// TODO : create audit event in factory
	}
	
	private static void testMethod() {
		Document document = new Document();
		document.setDocumentName("name");
		document.setDescription("description");
		document.setCreatedDate(new Date());
		
		System.out.println(document.toString());
		
		String jsonValue = AuditUtils.toJson(document);
		System.out.println(jsonValue);
		
		Document doc = (Document) AuditUtils.fromJson(jsonValue, Document.class);
		System.out.println(doc.toString());
	}

}
