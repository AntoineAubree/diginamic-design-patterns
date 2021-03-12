/**
 * 
 */
package fr.diginamic.factory.entites;

/**
 * @author Antoine
 *
 */
public abstract class ObjetConnecte {

	private float limiteVolts;

	public ObjetConnecte(float limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LimiteVolts = ");
		builder.append(limiteVolts);
		return builder.toString();
	}

	public float getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(float limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
