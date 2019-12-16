package ex1;

import java.util.Date;

/**Représente les attributs d'une classe entreprise*/
public class Entreprise {

	/**Siret : représente le siret de l'entreprise */
	public int siret;
	/**nom : représente le nom de l'entreprise */
	public String nom;
	/**adresse : représente l'adresse de l'entreprise */
	public String adresse;
	/**date : représente la date de l'entreprise */
	public Date dateCreation;

	/**Représente le capital maximum de l'entreprise*/
	public static final int CAPITAL_MAX = 3000000;

	/**Methode qui affiche le statut de l'entreprise*/
	public void afficherStatut() {

	}

}
