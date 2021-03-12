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

	public abstract String toString();

	public float getLimiteVolts() {
		return limiteVolts;
	}

	public void setLimiteVolts(float limiteVolts) {
		this.limiteVolts = limiteVolts;
	}

}
