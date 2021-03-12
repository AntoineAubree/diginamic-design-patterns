/**
 * 
 */
package fr.diginamic.factory.entites;

/**
 * @author Antoine
 *
 */
public class TelephonePortable extends ObjetConnecte {

	public TelephonePortable(float limiteVolts) {
		super(limiteVolts);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TelephonePortable [LimiteVolts()=");
		builder.append(getLimiteVolts());
		builder.append("]");
		return builder.toString();
	}

}
