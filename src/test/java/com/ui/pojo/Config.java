//package com.ui.pojo;
//
//import java.util.Map;
//
//public class Config {
//	Map<String, Environment> environments;
//
//	public Map<String, Environment> getEnvironment() {
//		return environments;
//	}
//
//	public void setEnvironment(Map<String, Environment> environments) {
//		this.environments = environments;
//	}
//	
//	
//}

package com.ui.pojo;

import java.util.Map;

public class Config {

    private Map<String, Environment> environments;

    public Map<String, Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Map<String, Environment> environments) {
        this.environments = environments;
    }
}
