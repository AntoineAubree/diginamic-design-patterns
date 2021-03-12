package fr.diginamic.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		ConfigurationSingleton cs = ConfigurationSingleton.getInstance();
		System.out.println(cs.getValue("db.url"));
		System.out.println(cs.getValue("db.user"));
		System.out.println(cs.getValue("db.password"));
	}

}
