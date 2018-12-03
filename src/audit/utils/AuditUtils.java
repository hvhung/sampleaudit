package audit.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AuditUtils {
	
	public static <T> Object fromJson(String json, Class<T> cls) {
		Gson gson = new GsonBuilder().create();
		return gson.fromJson(json, cls);
	}
	
	public static String toJson(Object value) {
		Gson gson = new GsonBuilder().create();
		return gson.toJson(value);
	}
	
}
