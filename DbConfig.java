package University;

import java.util.HashMap;
import java.util.Map;

public class DbConfig {

	public static DbConfig instance = null;
	private Map<String, String> dbConfigMap;
	
	private DbConfig(){
		dbConfigMap = new HashMap<String, String>();
		dbConfigMap.put("host", "reg-db.htu.edu.jo");
		dbConfigMap.put("port", "1521");
		dbConfigMap.put("name", "ORCL");
		dbConfigMap.put("userName", "reg");
		dbConfigMap.put("password", "Reg#2022");
	}
	
	public String get(String key) {
		return dbConfigMap.get(key);
	}
	
	public String update(String key, String value) {
		return dbConfigMap.put(key, value);
	}
	
	public static DbConfig getInstance() {
		if (instance == null) {
			instance = new DbConfig();
		}
		return instance;
	}
}
