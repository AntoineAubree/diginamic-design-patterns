/**
 * 
 */
package fr.diginamic.factory.entites;

/**
 * @author Antoine
 *
 */
public class Tablette extends ObjetConnecte {

	public Tablette(float limiteVolts) {
		super(limiteVolts);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tablette [LimiteVolts()=");
		builder.append(getLimiteVolts());
		builder.append("]");
		return builder.toString();
	}

}
