package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigurationSingleton {

	private static ConfigurationSingleton instance = new ConfigurationSingleton();
	private ResourceBundle resourceBundle;

	private ConfigurationSingleton() {
		this.resourceBundle = ResourceBundle.getBundle("configuration");
	}

	public static ConfigurationSingleton getInstance() {
		return ConfigurationSingleton.instance;
	}

	public String getValue(String key) {
		return this.resourceBundle.getString(key);
	}

}
