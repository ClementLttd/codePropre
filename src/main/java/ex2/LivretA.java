package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, tauxRemuneration);
	}
	
	
	
}
