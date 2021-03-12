/**
 * 
 */
package fr.diginamic.factory;

import fr.diginamic.factory.entites.ObjetConnecte;
import fr.diginamic.factory.entites.TypeObjetConnecte;

/**
 * @author Antoine
 *
 */
public class TestFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjetConnecte obj1 = ObjetConnecteFactory.creerObjetConnecte(TypeObjetConnecte.TELEPHONE_PORTABLE, 2.3f);
		ObjetConnecte obj2 = ObjetConnecteFactory.creerObjetConnecte(TypeObjetConnecte.TABLETTE, 3.6f);
		ObjetConnecte obj3 = ObjetConnecteFactory.creerObjetConnecte(TypeObjetConnecte.ENCEINTE_CONNECTEE, 4.2f);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}

}
