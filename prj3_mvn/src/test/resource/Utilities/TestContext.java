package Utilities;

import java.util.HashMap;
import java.util.Map;

public class TestContext {
	private Map<String, Object> current_Context;
	
	public TestContext() {
		current_Context = new HashMap<>();
	}
	
	public void set(String key, Object value) {
		current_Context.put(key, value);
	}
	
	public Object get(String key) {
		return current_Context.get(key);
	}
}
