/**
 * 
 */
package fr.diginamic.factory;

import fr.diginamic.factory.entites.EnceinteConnectee;
import fr.diginamic.factory.entites.ObjetConnecte;
import fr.diginamic.factory.entites.Tablette;
import fr.diginamic.factory.entites.TelephonePortable;
import fr.diginamic.factory.entites.TypeObjetConnecte;

/**
 * @author Antoine
 *
 */
public class ObjetConnecteFactory {

	public static ObjetConnecte creerObjetCOnnecte(TypeObjetConnecte typeObjetConnecte, float limiteVolts) {
		if (typeObjetConnecte.equals(TypeObjetConnecte.TELEPHONE_PORTABLE)) {
			return new TelephonePortable(limiteVolts);
		} else if (typeObjetConnecte.equals(TypeObjetConnecte.TABLETTE)) {
			return new Tablette(limiteVolts);
		} else if (typeObjetConnecte.equals(TypeObjetConnecte.ENCEINTE_CONNECTEE)) {
			return new EnceinteConnectee(limiteVolts);
		}
		return null;
	}

}
