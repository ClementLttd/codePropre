package ex1;

import java.util.Date;

/**Repr�sente les attributs d'une classe entreprise*/
public class Entreprise {

	/**Siret : repr�sente le siret de l'entreprise */
	public int siret;
	/**nom : repr�sente le nom de l'entreprise */
	public String nom;
	/**adresse : repr�sente l'adresse de l'entreprise */
	public String adresse;
	/**date : repr�sente la date de l'entreprise */
	public Date dateCreation;

	/**Repr�sente le capital maximum de l'entreprise*/
	public static final int CAPITAL_MAX = 3000000;

	/**Methode qui affiche le statut de l'entreprise*/
	public void afficherStatut() {

	}

}
