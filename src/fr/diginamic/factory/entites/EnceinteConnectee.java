/**
 * 
 */
package fr.diginamic.factory.entites;

/**
 * @author Antoine
 *
 */
public class EnceinteConnectee extends ObjetConnecte {

	public EnceinteConnectee(float limiteVolts) {
		super(limiteVolts);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnceinteConnectee [LimiteVolts()=");
		builder.append(getLimiteVolts());
		builder.append("]");
		return builder.toString();
	}

}
