
public class Ville extends Pays {
	
	
	
	private String nom;
	private int nbHabitants;
	private int superficie;
	
	
	
	//CONSTRUCTEUR
	public Ville(){
	}
	
	
	public Ville(String unNom, int unNbHabs, int uneSuperficie){
		this.nom = unNom;
		this.nbHabitants = unNbHabs;
		this.superficie = uneSuperficie;
	}
	//ACCESSEURS
	//NOM
	public String getNom(){
		return nom;
	}
	public void setNom(String unNom){
		this.nom = unNom;
	}

	
	//NOMBRE D'HABITANTS
	public int getNbHabitants(){
		return nbHabitants;
	}
	public void setNbHabitants(int unNbHabs){
		this.nbHabitants = unNbHabs;
	}
	
	
	//SUPERFICIE
	public int getSuperficie(){
		return superficie;
	}
	
	public void setSuperficie(int uneSuperficie){
		this.superficie = uneSuperficie;
	}
	
	
	//TO STRING
	public String toString(){
		String chaine = " ";
		chaine += "Nom : " + this.nom + "\n" + "Nombre d'habitants :  " + this.nbHabitants  + "\n" + "Superficie : " + this.superficie + "km²";
		return chaine;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
